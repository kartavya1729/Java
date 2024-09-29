public class Marketer 
{
    private String name;
    private String email;
    private int numberOfClients;
    private double monthlySales;

    // Default constructor
    public Marketer() 
    {
        this.name = "";
        this.email = "";
        this.numberOfClients = 0;
        this.monthlySales = 0.0;
    }

    // Parameterized constructor
    public Marketer(String name, String email, int numberOfClients, double monthlySales) 
    {
        this.name = name;
        this.email = email;
        this.numberOfClients = numberOfClients;
        this.monthlySales = monthlySales;
    }

    public void displayDetails()     // Method to display marketer details
    {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Number of Clients: " + numberOfClients);
        System.out.println("Monthly Sales: $" + monthlySales);
    }

    // Method to update the number of clients
    public void updateNumberOfClients(int newNumberOfClients) 
    {
        this.numberOfClients = newNumberOfClients;
    }

    // Method to update the monthly sales
    public void updateMonthlySales(double newMonthlySales) 
    {
        this.monthlySales = newMonthlySales;
    }

    // Method to calculate total sales (for simplicity, assume total sales is monthly sales for this example)
    public double calculateTotalSales() 
    {
        return this.monthlySales;
    }

    // Getters and setters
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public int getNumberOfClients() 
    {
        return numberOfClients;
    }

    public void setNumberOfClients(int numberOfClients) 
    {
        this.numberOfClients = numberOfClients;
    }

    public double getMonthlySales() 
    {
        return monthlySales;
    }

    public void setMonthlySales(double monthlySales) 
    {
        this.monthlySales = monthlySales;
    }

    public static void main(String[] args) 
    {
        // Create a Marketer object using the parameterized constructor
        Marketer marketer = new Marketer("Alice Johnson", "alice.johnson@example.com", 150, 12000.0);

        System.out.println("Marketer Details:");        // Display the marketer's details
        marketer.displayDetails();

        marketer.updateNumberOfClients(175);         // Update and display the number of clients
        System.out.println("\nUpdated Number of Clients: " + marketer.getNumberOfClients());

        marketer.updateMonthlySales(15000.0);         // Update and display the monthly sales
        System.out.println("Updated Monthly Sales: $" + marketer.getMonthlySales());

        System.out.println("Total Sales: $" + marketer.calculateTotalSales());         // Calculate and display the total sales
    }
}

