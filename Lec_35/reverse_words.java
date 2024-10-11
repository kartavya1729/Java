// package lec35;

// import java.util.Scanner;

public class reverse_words {
    public static void main(String[] args) {
        String res = reverse_words(" Hello World ");
        System.out.println(res);  // Printing the result
    }

    public static String reverse_words(String s) 
    {
        s = s.trim();  // Remove leading and trailing spaces
        String ans = "";
        String arr[] = s.split("\\s+");  // Corrected the split regex

        for (int i = arr.length - 1; i >= 0; i--) 
        {
            ans += arr[i] + " ";
        }
        return ans.trim();  // Trim the final result to remove extra space
    }
}
