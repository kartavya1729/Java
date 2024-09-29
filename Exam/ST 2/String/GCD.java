package String;

import java.util.Scanner;

public class GCD 
{
    public static String gcdOfStrings(String str1, String str2) 
    {
        if (!(str1 + str2).equals(str2 + str1)) 
        {
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());

        return str1.substring(0, gcdLength);
    }

    private static int gcd(int a, int b) 
    {
        if (b == 0) 
        {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // Find and display the GCD string
        String result = gcdOfStrings(str1, str2);
        System.out.println("GCD of the two strings: " + (result.isEmpty() ? "No common divisor" : result));

        sc.close();
    }
}