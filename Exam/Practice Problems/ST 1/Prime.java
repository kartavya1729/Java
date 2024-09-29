// package Practice Problems;

import java.util.Scanner;

public class Prime 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input: number of prime numbers to generate
        System.out.print("Enter the num of prime numbers to generate: ");
        int n = scanner.nextInt();

        // Generate and print the first n prime numbers
        int count = 0;
        int number = 2; // Start checking for prime numbers from 2

        while (count < n) 
        {
            if (isPrime(number)) 
            {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
        scanner.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) 
    {
        if (num <= 1) return false;

        if (num == 2) return true; // 2 is a prime number

        if (num % 2 == 0) return false; // Eliminate even numbers greater than 2

        for (int i = 3; i <= Math.sqrt(num); i += 2) 
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}