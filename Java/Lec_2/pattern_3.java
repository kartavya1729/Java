package Lec_2;

public class pattern_3 
{
    public static void main(String[] args) 
	    {
	        int n=5;
	        int row=1;
	        int star=5;
	        
	        while(row<=n)
	        {
	            int i=1;
	            
	            while(i<=star)
	            {
	                System.out.print("* ");
	                i++;
	            }
	            
	            row++;
	            
	            star--;
	            
	            System.out.println(" ");
	        }
	    }
}
