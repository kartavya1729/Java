package String;

import java.util.Scanner;

public class reverse_str
{
    public static String reverse(String str) 
    {
        StringBuilder reversedString = new StringBuilder(str);

        return reversedString.reverse().toString();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        String result = reverse(input);
        System.out.println("Reversed string: " + result);

        sc.close();
    }
}