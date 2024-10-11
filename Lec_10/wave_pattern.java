package Lec_10;

import java.util.Scanner;

public class wave_pattern 
{
	    public static void main(String[] arg)
	    {
	        int[][] arr = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };
	        
//	        int arr[][] = new int[3][3];  // user input
//	        for(int i = 0;i < 3; i++){
//	            for(int j = 0; j < 3;j++){
//	                System.out.println("Enter the element");
//	                Scanner sc = new Scanner(System.in);
//	                int n = sc.nextInt();
//	                arr[i][j]=n;
//	            }
//	        }

	        for(int i = 0; i < 3; i++)
	        {
	            for(int j = 0; j < 3; j++)
	            {
	                System.out.print(arr[i][j]);
	                
	                System.out.print(" "); // It prints each element followed by a space.
	            }
	            
//	            After each row, it prints a newline character to format the output.
	            System.out.println();
	        }

	        System.out.println();

	        for(int i= 0;i < 3; i++)
	        {
//	        	For even indexed columns (i % 2 == 0), the inner loop iterates from top to bottom.
	            if(i % 2 == 0)
	            {
	                for(int j = 0; j < 3; j++)
	                {
	                    System.out.print(arr[j][i]);
	                    System.out.print(" ");
	                }
	            }
//	         For odd indexed columns (else), the inner loop iterates from bottom to top.
	            else
	            {
	                for(int j = 2;j >= 0; j--)
	                {
	                    System.out.print(arr[j][i]);
	                    System.out.print(" ");
	                }
	            }

	        }
	    }
	}

