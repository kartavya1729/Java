package Lec_7;

public class max_num {
	public static void main(String[] args) 
    {

    	int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // input array
        
        int maxNumber = findMax(numbers); // call
        
        System.out.println("The maximum number is: " + maxNumber); // output
    }

    public static int findMax(int[] arr) 
    {
        int max = arr[0]; // Assume  consider first element as maximum element
        
        for (int num : arr) 
        {
            if (num > max) 
            {
                max = num;
            }
        }
        return max;
    }
}