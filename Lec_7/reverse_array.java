package Lec_7;

public class reverse_array 
{
    public static void main(String[] args) 
    {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // input array
        
        reverseArray(numbers); // function call
        
        System.out.print("Reversed array: ");
        
        for (int num : numbers)  // Print reverse array
        {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int[] arr) 
    {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) 
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
}
