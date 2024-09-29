import java.util.Scanner;

public class FibonacciModulo 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
        
        int fib = fibonacci(n);
        
        int result = fib % m;
        
        // Display the result
        System.out.println("Fibonacci number F(" + n + ") % " + m + " = " + result);
        
        scanner.close();
    }

    // Function to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        
        int a = 0;
        int b = 1;
        int c = 0;
        
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        
        return c;
    }
}
