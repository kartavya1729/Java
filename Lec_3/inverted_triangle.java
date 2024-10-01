package Lec_3;

public class inverted_triangle 
{
    public static void main(String args[])
    {		
		int n = 5;
        int row = 2 * n - 1;
        int space = n - 1;
        int star = 1;
        
        int i = 1;
        
        while(i <= row)
        {
            int j = 1;
            
            while(j <= space)
            {
                System.out.print("  ");
                j++;
            }
            
            int k = 1;
            
            while(k <= star)
            {
                System.out.print("* ");
                k++;
            }
            
            if(i < n)
            {
                star++;
                space--;
            }
            
            else
            {
                star--;
                space++;
            }
            
            System.out.println();
            i++;
        }
    }
}
