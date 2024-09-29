import java.util.Scanner;

public class palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the integer (0 <= n <= 9999): ");
        int n = sc.nextInt();
        
        if (n >= 0 && n <= 9999) 
        {
            int orig = n;
            int rev = 0;
            
            while (n != 0) 
            {
                int digit = n % 10;
                rev = rev * 10 + digit;
                n /= 10;
            }
            
            if (orig == rev) 
            {
                System.out.println("Equal");
            } 

            else 
            {
                System.out.println("Not Equal");
            }
        } 

        else 
        {
            System.out.println("Input number out of range.");
        }
        
        sc.close();
    }
}