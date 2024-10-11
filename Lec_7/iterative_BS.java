package Lec_7;

public class iterative_BS 
{
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if the key is present at mid
            if (array[mid] == key) {
                return mid;
            }

            // If key greater, ignore the left half
            if (array[mid] < key) {
                low = mid + 1;
            } else {
                // If key is smaller, ignore the right half
                high = mid - 1;
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

        int result = binarySearch(numbers, key);

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
