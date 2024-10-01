package Lec_3;

public class pencil_pattern 
{
    public static void main(String[] args) 
	{
		int n = 5;
		int row = 1;
		int star = n;
		int space = n-1;
		
		while(row <= 2 * n - 1)
		{
			// printing space
			int i=0;
			
			while(i <= space)
			{
				System.out.print("  ");
				i++;
			}
			
			// printing stars
			int j=1;
			
			while(j <= star)
			{
				System.out.print("* "
						+ "");
				j++;
			}
			
			if( row < n)
			{
				star--;
				space--;
			}
			
			else
			{
				star++;
				space++;
			}
			
			// next row preparation
			row++;
			System.out.println();
			
		}
		
	}
}
