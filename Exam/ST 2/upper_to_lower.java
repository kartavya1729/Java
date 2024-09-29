    
public class upper_to_lower 
{
    public static void main(String[] args) 
    {
        String input = "HeLLo WoRLD!";
        String output = convertToLower(input);
        System.out.println(output);  // Output: hello world!
    }

    public static String convertToLower(String str) 
    {
        return str.toLowerCase();
    }
}

