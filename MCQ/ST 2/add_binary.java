    
import java.util.Scanner;

public class add_binary 
{
    public static String addBinary(String a, String b) 
    {
        StringBuilder res = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) 
        {
            int sum = carry;

            if (i >= 0) 
            {
                sum += a.charAt(i--) - '0';
            }

            if (j >= 0) 
            {
                sum += b.charAt(j--) - '0';
            }

            res.append(sum % 2);

            carry = sum / 2;
        }

        return res.reverse().toString();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first binary string: ");
        String a = sc.nextLine();

        System.out.print("Enter second binary string: ");
        String b = sc.nextLine();

        String result = addBinary(a, b);
        System.out.println("Sum of binary strings: " + result);

        sc.close();
    }
}