    
import java.util.Scanner;

public class Valid_Array_Index 
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] array = new int[n];

            for (int i = 0; i < n; i++) 
            {
                array[i] = sc.nextInt();
            }

            int q = sc.nextInt();

            for (int i = 0; i < q; i++) 
            {
                int index = sc.nextInt();

                try 
                {
                    System.out.println(array[index]);
                } 

                catch (ArrayIndexOutOfBoundsException e) 
                {
                    System.out.println("Out of Bounds");
                }
            }
            sc.close();
    }
}