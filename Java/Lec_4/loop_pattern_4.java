package Lec_4;

public class loop_pattern_4 
{
    public static void main(String[] args) 
	{
		int n = 7;
		int star = n/2;
		int space = 1;
		int i = 1;
	        
	        while (i <= n) 
	        {
	          // Print left stars
	          int j = 1;
	          
	          while (j <= star) 
	          {
	              System.out.print("* ");
	              j++;
	            }
	            
	            // Print spaces
	            int k = 1;
	            
	            while (k <= space) 
	            {
	                System.out.print("  ");
	                k++;
	            }
	            
	            // Print right stars
	            int l = 1;
	            
	            while (l <= star) 
	            {
	                System.out.print("* ");
	                l++;
	            }
	            
	            // Adjust stars and spaces based on the current row
	            
	            if (i <= n/2) 
	            {
	                star = star - 1;
	                
	                space = space + 2;
	            }
	            
	            else 
	            {
	                star++;
	                
	                space = space - 2;
	            }
	            
	            i++;
	            
	            System.out.println();
	            }	
	        }
}
