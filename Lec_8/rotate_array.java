package Lec_8;

import java.util.Scanner;

public class rotate_array {
	public static void main(String[] args) {
		
		int []arr = {1,2,3,4,5,6,7};
		
		roatate_array(arr,3);
		
		for(int i=0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void roatate_array(int[]arr,int k)
	{
		int n = arr.length;
		k = k % n;
		reverse_in_range(arr,0,n-1);
		reverse_in_range(arr,0,k-1);
		reverse_in_range(arr,k,n-1);
	}
	
	public static void reverse_in_range(int[]arr, int i, int j)
	{
		while (i < j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
		
//		Scanner sc = new Scanner(System.in);
//		
//		int n;
//		
//		int []arr = new int[100]; // declaration of array on heap
//		
//		System.out.print("Enter size of array: ");
//		
//		n = sc.nextInt();
//		
//		System.out.print("Enter Array elements: ");
//		
//		for(int i = 0; i < n; i++) 
//		{
//			arr[i] = sc.nextInt();
//		}
//		
//		System.out.print("Enter rotation index: ");
//
//		int num = sc.nextInt();
//				
//		for(int k = 0; k < num; k++) 
//		{
//			int i = n - 1;
//			
//			int temp = arr[n-1];
//			
//			while(i > 0) 
//			{
//				arr[i] = arr[i-1];
//				
//				i--;
//			}
//			
//			arr[0] = temp;
//		}
//		
//		System.out.print("Rotated array: ");
//		
//		for(int j = 0; j < n; j++) 
//		{
//			System.out.print(arr[j]+" ");
//		}
}
