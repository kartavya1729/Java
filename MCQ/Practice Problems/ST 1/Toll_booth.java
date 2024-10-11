public class Toll_booth 
{
    private int numberOfVehicles;
    private double totalTollCollected;

    // Constructor to initialize the TollBooth
    public Toll_booth() 
    {
        this.numberOfVehicles = 0;
        this.totalTollCollected = 0.0;
    }

    // Method to record a vehicle passing through the toll booth
    public void vehiclePassed(double toll) 
    {
        numberOfVehicles++;

        totalTollCollected += toll;
    }

    // Method to reset the toll booth data
    public void reset() 
    {
        this.numberOfVehicles = 0;

        this.totalTollCollected = 0.0;
    }

    // Getters for number of vehicles and total toll collected
    public int getNumberOfVehicles() 
    {
        return numberOfVehicles;
    }

    public double getTotalTollCollected() 
    {
        return totalTollCollected;
    }

    // Method to represent the TollBooth data as a string
    @Override
    public String toString() 
    {
        return "Number of Vehicles: " + numberOfVehicles + 
               "\nTotal Toll Collected: $" + totalTollCollected;
    }

    // Main method for testing the TollBooth class
    public static void main(String[] args) 
    {
        // Create a TollBooth object
        Toll_booth tollBooth = new Toll_booth();

        // Simulate some vehicles passing through the toll booth
        tollBooth.vehiclePassed(2.50); // Car passes with a toll of $2.50
        tollBooth.vehiclePassed(3.75); // Truck passes with a toll of $3.75
        tollBooth.vehiclePassed(2.50); // Another car passes with a toll of $2.50

        System.out.println(tollBooth);         // Display the current toll booth data

        tollBooth.reset();         // Reset the toll booth data

        // Display the toll booth data after reset
        System.out.println("After reset:");

        System.out.println(tollBooth);
    }
}