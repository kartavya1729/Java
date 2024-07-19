package Lec_3;

public class space_triangle 
{
    public static void main(String[] args) 
	{
		int n=5;
        int i=1;
        int row=n;
        int star=5;
        int space=0;
        
        while(i<=row)
        {
            int j=1;
            
            while(j<=space)
            {
                System.out.print("   ");
                j++;
            }
            
            int k=1;
            
            while(k<=star)
            {
                System.out.print(" * ");
                k++;
            }
            
            i++;
            
            star--;
            
            space++;
            
            System.out.println();

        }
	}
}
