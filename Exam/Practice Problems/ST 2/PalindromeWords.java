public class PalindromeWords 
{
    public static boolean isPalindrome(String word) 
    {
        int length = word.length();

        for (int i = 0; i < length / 2; i++) 
        {
            if (word.charAt(i) != word.charAt(length - i - 1)) 
            {
                return false;
            }
        }
        return true;
    }

    public static int findPalindromeWords(String str) 
    {
        String[] words = str.split("\\s+");

        int palindromeCount = 0;

        System.out.println("Palindrome words found:");

        for (String word : words) 
        {
            if (isPalindrome(word)) 
            {
                System.out.println(word);

                palindromeCount++;
            }
        }
        return palindromeCount;
    }

    public static void main(String[] args) 
    {
        String sentence = "madam racecar level noon civic hello world";
        
        int count = findPalindromeWords(sentence);

        System.out.println("Total number of palindrome words: " + count);
    }
}
