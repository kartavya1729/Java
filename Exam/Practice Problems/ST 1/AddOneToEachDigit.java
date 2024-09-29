// package Practice Problems;

import java.util.Scanner;

public class AddOneToEachDigit 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input a four-digit number
        System.out.print("Enter a four-digit number: ");
        int number = scanner.nextInt();

        // Extract each digit
        int thousands = number / 1000;
        int hundreds = (number % 1000) / 100;
        int tens = (number % 100) / 10;
        int units = number % 10;

        // Add 1 to each digit (handle cases where digit becomes 10 by modulo 10)
        thousands = (thousands + 1) % 10;
        hundreds = (hundreds + 1) % 10;
        tens = (tens + 1) % 10;
        units = (units + 1) % 10;

        // Combine the digits back into a single number
        int newNumber = thousands * 1000 + hundreds * 100 + tens * 10 + units;

        // Output the result
        System.out.println("Result after adding 1 to each digit: " + newNumber);

        scanner.close();
    }
}