package String;


import java.util.Scanner;

public class PalindromeCount 
{
    public static boolean isPalindrome(String str) 
    {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) 
        {
            if (str.charAt(left) != str.charAt(right)) 
            {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public static int countPalindromes(String sentence) 
    {
        String[] words = sentence.split("\\s+");

        int palindromeCount = 0;

        for (String word : words) 
        {
            if (isPalindrome(word)) 
            {
                palindromeCount++;
            }
        }
        return palindromeCount;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        int count = countPalindromes(input);
        System.out.println("Number of palindromes in the sentence: " + count);

        sc.close();
    }
}