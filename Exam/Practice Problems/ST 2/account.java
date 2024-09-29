interface AccountActions 
{
    void deposit(double amount);

    void withdraw(double amount);
}

class Customer 
{
    private String customerId;
    private String name;
    private String email;

    public Customer(String customerId, String name, String email) 
    {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    public void displayCustomerInfo() 
    {
        System.out.println("Customer ID: " + customerId);

        System.out.println("Customer Name: " + name);
        
        System.out.println("Customer Email: " + email);
    }
}

class BankAccount implements AccountActions 
{
    private String accountNumber;
    private double balance;
    private Customer customer;

    public BankAccount(String accountNumber, double balance, Customer customer) 
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    @Override
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } 
        
        else 
        {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } 
        
        else 
        {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public void displayAccountInfo() 
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        customer.displayCustomerInfo();
    }
}

public class account {
    public static void main(String[] args) 
    {
        Customer customer1 = new Customer("C001", "John Doe", "john@example.com");

        BankAccount account1 = new BankAccount("A12345", 1000.0, customer1);

        account1.displayAccountInfo();

        account1.deposit(500.0);

        account1.withdraw(300.0);

        account1.displayAccountInfo();
    }
}