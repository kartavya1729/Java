public class SwapFirstLastchar {
    public static void main(String[] args) 
    {
        System.out.println("Code Quotient");
    }

    static String swapFirstLastChar(String str) 
    {
        String[] arr = str.split(" ");
        String ans = "";

        for(String word : arr)
        {
            char ch1 = word.charAt(0);
            char ch2 = word.charAt(word.length() - 1);
            ans += ch2 + word.substring(1,word.length()-1) + ch1;
            ans += " ";
        }
        return ans.trim();
    }
}