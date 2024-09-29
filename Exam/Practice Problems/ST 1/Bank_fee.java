public class Bank_fee 
{
    private double monthlyMaintenanceFee;
    private double transactionFee;
    private double overdraftFee;
    private int numberOfTransactions;
    private boolean isOverdrawn;

    // Constructor to initialize BankFee with default or specific values
    public Bank_fee(double monthlyMaintenanceFee, double transactionFee, double overdraftFee) 
    {
        this.monthlyMaintenanceFee = monthlyMaintenanceFee;
        this.transactionFee = transactionFee;
        this.overdraftFee = overdraftFee;
        this.numberOfTransactions = 0;
        this.isOverdrawn = false;
    }

    // Method to apply a transaction and calculate the corresponding fee
    public void applyTransaction() 
    {
        numberOfTransactions++;
    }

    // Method to set the account status to overdrawn
    public void setOverdrawn(boolean isOverdrawn) 
    {
        this.isOverdrawn = isOverdrawn;
    }

    // Method to calculate the total monthly fee
    public double calculateTotalFee() 
    {
        double totalFee = monthlyMaintenanceFee + (numberOfTransactions * transactionFee);
        if (isOverdrawn) 
        {
            totalFee += overdraftFee;
        }
        return totalFee;
    }

    // Getters and setters for each field
    public double getMonthlyMaintenanceFee() 
    {
        return monthlyMaintenanceFee;
    }

    public void setMonthlyMaintenanceFee(double monthlyMaintenanceFee) 
    {
        this.monthlyMaintenanceFee = monthlyMaintenanceFee;
    }

    public double getTransactionFee() 
    {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) 
    {
        this.transactionFee = transactionFee;
    }

    public double getOverdraftFee() 
    {
        return overdraftFee;
    }

    public void setOverdraftFee(double overdraftFee) 
    {
        this.overdraftFee = overdraftFee;
    }

    public int getNumberOfTransactions() 
    {
        return numberOfTransactions;
    }

    public void resetTransactions() 
    {
        this.numberOfTransactions = 0;
    }

    public boolean isOverdrawn() 
    {
        return isOverdrawn;
    }

    // Method to represent the BankFee as a string
    @Override
    public String toString() 
    {
        return "Monthly Maintenance Fee: $" + monthlyMaintenanceFee +
               "\nTransaction Fee per Transaction: $" + transactionFee +
               "\nNumber of Transactions: " + numberOfTransactions +
               "\nOverdraft Fee: $" + overdraftFee +
               "\nAccount Overdrawn: " + (isOverdrawn ? "Yes" : "No") +
               "\nTotal Monthly Fee: $" + calculateTotalFee();
    }

    // Main method for testing the BankFee class
    public static void main(String[] args) 
    {
        // Create a BankFee object with specific fees
        Bank_fee bankFee = new Bank_fee(10.00, 0.50, 25.00);

        // Simulate some transactions
        bankFee.applyTransaction();
        bankFee.applyTransaction();
        bankFee.applyTransaction();

        bankFee.setOverdrawn(true);         // Set account status to overdrawn

        System.out.println(bankFee);         // Display the fee details

        // Calculate and print the total fee
        System.out.println("Total Fee for the Month: $" + bankFee.calculateTotalFee());
    }
}