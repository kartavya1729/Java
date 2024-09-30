package Lec_2;

public class nested_loops 
{
    public static void main(String[] args) 
	{
		int n = 5;
		int row = 1;
		int star = n;
		
		while (row <= n)
		{
			int i =1; // counter 
			
			while(i <= star)
			{
				System.out.print(" * ");
				i++;
			}
			
			row++;
			System.out.println( );
		}

	}

	
//	 public static void main(String[] args) 
//	 {
//	        int n = 5;
//
//	        for (int i = 0; i < n; i++) // rows
//	        {
//	            for (int j = 0; j < n; j++) // columns
//	            {
//	                System.out.print("* ");
//	            }
//	            
//	            System.out.println(); // next line after each row
//	        }
//	    }
	
}