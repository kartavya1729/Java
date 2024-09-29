import java.util.Scanner;

public class NextClosestFibonacci 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the next closest Fibonacci number
        int nextFib = nextClosestFibonacci(number);

        // Output the result
        System.out.println("The next closest Fibonacci number is: " + nextFib);

        scanner.close();
    }

    // Function to find the next closest Fibonacci number
    public static int nextClosestFibonacci(int num) 
    {
        // Initial Fibonacci numbers
        int a = 0;
        int b = 1;

        // If num is less than or equal to 1, return 1
        if (num <= 1) 
        {
            return 1;
        }

        // Generate Fibonacci numbers until we find one greater than or equal to num
        while (b < num) 
        {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return b;
    }
}