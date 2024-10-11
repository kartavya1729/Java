    
public class Box 
{
    private double width;
    private double height;
    private double depth;

    // Default constructor
    public Box() 
    {
        this.width = 0;
        this.height = 0;
        this.depth = 0;
    }

    // Parameterized constructor
    public Box(double width, double height, double depth) 
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double calculateVolume()     // Method to calc the volume of the box
    {
        return width * height * depth;
    }

    public double calculateSurfaceArea()     // Method to calc surface area of the box
    {
        return 2 * (width * height + height * depth + depth * width);
    }

    public void displayDimensions()     // Method to display the dimensions of the box
    {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Depth: " + depth);
    }

    // Getters and setters for width, height, and depth
    public double getWidth() 
    {
        return width;
    }

    public void setWidth(double width) 
    {
        this.width = width;
    }

    public double getHeight() 
    {
        return height;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }

    public double getDepth() 
    {
        return depth;
    }

    public void setDepth(double depth) 
    {
        this.depth = depth;
    }

    public static void main(String[] args) 
    {
        // Create a Box object using the parameterized constructor
        Box box = new Box(5, 10, 3);

        // Display the dimensions of the box
        box.displayDimensions();

        // Calculate and display the volume of the box
        System.out.println("Volume: " + box.calculateVolume());

        // Calculate and display the surface area of the box
        System.out.println("Surface Area: " + box.calculateSurfaceArea());
    }
}