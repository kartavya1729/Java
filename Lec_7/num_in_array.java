package Lec_7;

import java.util.Scanner;

public class num_in_array {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        System.out.print("Enter a number to search for: ");
        
        int userInput = scanner.nextInt();
        
        if (search(numbers, userInput)) 
        {
            System.out.println("Number found: " + userInput);
        } 
        
        else 
        {
            System.out.println("Number not found.");
        }
        
        scanner.close();
    }

    public static boolean search(int[] arr, int target) 
    {
        for (int num : arr) 
        {
            if (num == target) 
            {
                return true;
            }
        }
        return false;
    }
}