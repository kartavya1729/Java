class SynchronizedAccount 
{
    private double balance;

    public SynchronizedAccount(double initialBalance) 
    {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) 
    {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", New balance: " + balance);
    }

    public synchronized void withdraw(double amount) 
    {
        if (balance >= amount) 
        {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", New balance: " + balance);
        } 

        else 
        {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " but insufficient balance.");
        }
    }

    public synchronized double getBalance() 
    {
        return balance;
    }
}

public class Transactions 
{
    public static void main(String[] args) 
    {
        SynchronizedAccount account = new SynchronizedAccount(1000.0); // Initial balance of 1000

        Thread t1 = new TransactionThread(account, true, 200);  // Deposit 200
        Thread t2 = new TransactionThread(account, false, 300); // Withdraw 300
        Thread t3 = new TransactionThread(account, false, 500); // Withdraw 500
        Thread t4 = new TransactionThread(account, true, 400);  // Deposit 400

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
