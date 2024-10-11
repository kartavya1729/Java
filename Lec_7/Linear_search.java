package Lec_7;

public class Linear_search 
{
    // Method
    public static int linearSearch(int[] array, int key) 
    {
        for (int i = 0; i < array.length; i++) 
        {
        	
            if (array[i] == key) 
            {
                return i; // If found, return the index of the key

            }
        }
        
        return -1;  // If not found, return -1
    }

    public static void main(String[] args) 
    {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; // array of integers

        int key = 10; // key to search

        int result = linearSearch(numbers, key); // call

        if (result != -1) 
        {
            System.out.println("Element found at index: " + result);
        } 
        
        else 
        {
            System.out.println("Element not found in the array.");
        }
    }
}