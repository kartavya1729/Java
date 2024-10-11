
// A Kaprekar number is a number that, when squared and split into two parts, 
// the sum of those parts is equal to the original number.

import java.util.Scanner;

public class Kaprekar {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate square of the number
        int square = number * number;

        // Convert the square to a string to split it
        String squareStr = Integer.toString(square);

        // Split the square string into two parts
        int len = squareStr.length();
        
        String leftPart = len > 1 ? squareStr.substring(0, len / 2) : "0";

        String rightPart = squareStr.substring(len / 2);

        // Convert the split parts to integers
        int leftNum = Integer.parseInt(leftPart);

        int rightNum = Integer.parseInt(rightPart);

        // Check if the sum of the two parts equals the original number
        if (leftNum + rightNum == number) 
        {
            System.out.println(number + " is a Kaprekar number.");
        } 

        else 
        {
            System.out.println(number + " is not a Kaprekar number.");
        }

        scanner.close();
    }
}

