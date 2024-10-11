package Lec_7;

public class recursive_BS 
{
    // Method
    public static int binarySearchRecursive(int[] array, int key, int low, int high) 
    {
        if (low <= high) 
        {
            int mid = (low + high) / 2;

            // Check if the key is present at mid
            if (array[mid] == key) 
            {
                return mid;
            }

            // If key is greater, ignore the left half
            if (array[mid] < key) 
            {
                return binarySearchRecursive(array, key, mid + 1, high);
            } 
            
            else 
            {
                // If key is smaller, ignore the right half
                return binarySearchRecursive(array, key, low, mid - 1);
            }
        }

        // Key not found
        return -1;
    }

    // Main method
    public static void main(String[] args) 
    {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 10;

        int result = binarySearchRecursive(numbers, key, 0, numbers.length - 1);

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