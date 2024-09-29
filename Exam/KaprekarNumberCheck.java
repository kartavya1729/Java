import java.util.Scanner;

public class KaprekarNumberCheck 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (0 <= n <= 9999): ");
        int n = sc.nextInt();
        
        if (n >= 0 && n <= 9999) 
        {
            if (isKaprekar(n)) 
            {
                System.out.println(1);
            } 

            else 
            {
                System.out.println(0);
            }
        } 
        else 
        {
            System.out.println("Input number out of range.");
        }
        
        sc.close();
    }

    public static boolean isKaprekar(int n) 
    {
        if (n == 1) 
        {
            return true;
        }

        long square = (long) n * n;
        String squareStr = Long.toString(square);
        int len = squareStr.length();

        for (int i = 1; i < len; i++) 
        {
            String leftPart = squareStr.substring(0, i);

            String rightPart = squareStr.substring(i);

            int leftNum = (leftPart.equals("")) ? 0 : Integer.parseInt(leftPart);
            
            int rightNum = Integer.parseInt(rightPart);

            if (leftNum + rightNum == n) 
            {
                return true;
            }
        }

        return false;
    }
}
