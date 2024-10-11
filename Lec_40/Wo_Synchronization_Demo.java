package Lec_40;

class BankAccount
{
    private int balance = 1000;

    public synchronized void withdraw(int amount)
    {
        if(balance > amount)
        {
            System.out.println(Thread.currentThread().getName() + "is Withdrawing");
            balance -= amount;
            System.out.println("Withdrawal Completed for " + Thread.currentThread().getName() + "New Balance:" + balance);
        }

        else
        {
            System.out.println("Insufficient Balance for" + Thread.currentThread().getName());
        }
    }
}

public class Wo_Synchronization_Demo 
{
    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(700),"Person1");

        Thread t2 = new Thread(() -> account.withdraw(500),"Person2");

        t1.start();
        t2.start();
    }
}