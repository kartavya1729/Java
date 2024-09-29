import java.util.Scanner;

public class valid_words 
{
    public static boolean isValidWord(String word) 
    {
        int hyphen = 0;
        int punctuation = 0;

        for (int i = 0; i < word.length(); i++) 
        {
            char ch = word.charAt(i);

            if (Character.isLetter(ch)) 
            {
                continue;
            }

            if (ch == '-') 
            {
                hyphen++;

                if (hyphen > 1 || i == 0 || i == word.length() - 1 || !Character.isLetter(word.charAt(i - 1)) || !Character.isLetter(word.charAt(i + 1))) 
                {
                    return false;
                }
            }

            if (ch == '.' || ch == ',' || ch == '!') 
            {
                punctuation++;

                if (punctuation > 1 || i != word.length() - 1) 
                {
                    return false;
                }
            }

            if (!Character.isLetter(ch) && ch != '-' && ch != '.' && ch != ',' && ch != '!') 
            {
                return false;
            }
        }
        return true;
    }

    public static int countValidWords(String sentence) 
    {
        String[] words = sentence.split("\\s+");

        int validWord = 0;

        for (String word : words) 
        {
            if (isValidWord(word)) 
            {
                validWord++;
            }
        }
        return validWord;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        int validWords = countValidWords(sentence);
        System.out.println("Number of valid words: " + validWords);

        sc.close();
    }
}

