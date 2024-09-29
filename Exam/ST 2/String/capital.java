package String;

    
import java.util.Scanner;

public class capital 
{
    public static String capitalizeFirstLetters(String str) 
    {
        String[] words = str.split("\\s+");

        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words) 
        {
            if (word.length() > 0) 
            {
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

                capitalizedSentence.append(capitalizedWord).append(" ");
            }
        }

        return capitalizedSentence.toString().trim();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String result = capitalizeFirstLetters(input);
        System.out.println("Capitalized sentence: " + result);

        sc.close();
    }
}