    
public class count_Valid_Palindrome 
{
    public static void main(String[] args) 
    {
        System.out.println(countPalindrome("Mom and Dad are my best friend"));

    }
    static int countPalindrome(String str) {
        // Write your code here
        str = str.toLowerCase();
        String[] arr = str.split(" ");
        int count = 0;
        for(String word : arr)
        {
            if(isPal(word)) count++;
        }
        return count;
    }
    public static boolean isPal(String s)
    {
        int left = 0;
        int right = s.length() - 1;
        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
