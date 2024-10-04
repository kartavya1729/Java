package Lec_6;

public class array 
{

	public static void main(String[] args) 
	{
        int arr[] = {2, 3, 4, 5, 6};
        
        swap(arr, 0, 1);
        
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static void swap(int[] array, int index1, int index2) 
    {
        int temp = array[index1];
        
        array[index1] = array[index2];
        
        array[index2] = temp;
    }

}
