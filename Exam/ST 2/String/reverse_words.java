package String;

import java.util.Scanner;

public class reverse_words 
{
    public static String reverseWordsInString(String str) 
    {
        String[] words = str.split("\\s+");

        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) 
        {
            StringBuilder reversedWord = new StringBuilder(word);

            reversedSentence.append(reversedWord.reverse().toString()).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String result = reverseWordsInString(input);
        System.out.println("Reversed words sentence: " + result);

        sc.close();
    }
}