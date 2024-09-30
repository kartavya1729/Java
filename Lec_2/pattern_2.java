package Lec_2;

public class pattern_2 
{
    public static void main(String[] args)
	    {
	    	int n = 5;
	    	int row = 1;
	        int col;
	        
	        while (row <= n) 
	        {
	            col = 1;
	            
	            while (col <= row) 
	            {
	                System.out.print(" * ");
	                
	                col++;
	            }
	            
	            System.out.println();
	            
	            row++;
	        }
	        
	        
//	    int row,col;
//	    
//	    for(row=1; row<=5; row++)
//	    {
//	    	for(col=1; col<=row; col++)
//	    	{
//	    		System.out.print(" * ");
//	    	}
//	    	
//	         System.out.println();
//	    	}
//	    
//	    }//end of main
	        
	    }
}
