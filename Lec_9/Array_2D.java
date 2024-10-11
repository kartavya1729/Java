package Lec_9;

public class Array_2D 
{
	    public static void main(String[] args) 
	    {
	        // Initialize the 2D array
	        int[][] array = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        
	        displayArray(array);   // Call the display function to print the array
	    }

	    public static void displayArray(int[][] array) // Function to display the 2D array

	    {
	        for (int i = 0; i < array.length; i++) // input for Rows
	        {
	            for (int j = 0; j < array[i].length; j++) // input for columns
	            {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}