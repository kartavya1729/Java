package Lec_2;

public class pattern_4 
{
    public static void main(String args[])
	    {
	        int n=5;
	        int row=n;
	        int star=1;
	        int space=n-1;
	        int i=1;
	        
	        while(i<=row)
	        {
	            int j=1;
	            
	            while(j<=space)
	            {
	                System.out.print("  ");
	                j++;
	            }
	            
	            int k=1;
	            
	            while(k<=star)
	            {
	                System.out.print("* ");
	                k++;
	            }
	            
	            System.out.println();
	            
	            i++;
	            space--;
	            star++;

	        }

	    }
}
	
//	public static void main(String[] args) 
//	{
//		int n = 5;
//		int row = 1;
//		int star = 1;
//		int space = n-1;
//		
//		while(row <= n)
//		{
//			int i=1; // counter for outer loop
//			
//			while(i<= space)
//			{
//				System.out.print("   ");
//				i++;
//			}
//			
//			int j=1; // counter for inner loop
//			
//			while (j <= star)
//			{
//				System.out.print(" *   ");
//				j++;
//			}
//			// next row preparation
//			row++;
//			star++;
//			System.out.println();
//			space --;
//
//		}
//		
//	}
