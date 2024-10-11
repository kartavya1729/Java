package String;

import java.util.Scanner;

public class compression 
{
    public static String compressString(String str) 
    {
        if (str == null || str.length() == 0) 
        {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) 
        {
            if (str.charAt(i) == str.charAt(i - 1)) 
            {
                count++;
            } 
            
            else 
            {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        compressed.append(str.charAt(str.length() - 1)).append(count);

        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to compress: ");
        String input = sc.nextLine();

        String compressedString = compressString(input);
        System.out.println("Compressed string: " + compressedString);

        sc.close();
    }
}