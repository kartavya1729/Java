package Lec_8;

import java.util.Arrays;

public class reverse_in_range {
	    public static void main(String[] args) 
	    {
	        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        
	        int start = 2; // Starting index of the range (inclusive)
	        
	        int end = 6;   // Ending index of the range (inclusive)

	        System.out.println("Original array: " + Arrays.toString(array));
	        
	        reverse_in_range(array, start, end);
	        
	        System.out.println("Reversed array: " + Arrays.toString(array));
	    }

	    public static void reverse_in_range(int[] array, int start, int end) 
	    {
	        while (start < end) 
	        {
	            int temp = array[start];
	            
	            array[start] = array[end];
	            
	            array[end] = temp;
	            
	            start++;
	            
	            end--;
	        }
	    }
}