    
public class ASCII 
{
    public static void main(String[] args) 
    {
        String input = "FAN";

        convertToAscii(input);
    }

    public static void convertToAscii(String str) 
    {
        System.out.println("ASCII values of the string \"" + str + "\":");
        
        for (int i = 0; i < str.length(); i++) 
        {
            char character = str.charAt(i);  // Get each character

            int asciiValue = (int) character; // Convert the character to ASCII
            
            System.out.println("Character: " + character + " -> ASCII: " + asciiValue);
        }
    }
}