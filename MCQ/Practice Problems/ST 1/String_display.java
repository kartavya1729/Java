public class String_display 
{
    public void displayOriginal(String str)     // Method to display a string as is
    {
        System.out.println("Original String: " + str);
    }

    public void displayUppercase(String str)     // Method to display a uppercase
    {
        System.out.println("Uppercase String: " + str.toUpperCase());
    }

    public void displayLowercase(String str)     //  lowercase
    {
        System.out.println("Lowercase String: " + str.toLowerCase());
    }

    public void displayReversed(String str)     // Method to display in  reverse order
    {
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + reversedStr);
    }

    public void displayLength(String str)     // Method to display length of the string
    {
        System.out.println("Length of String: " + str.length());
    }

    // Method to display the string with a custom prefix and suffix
    public void displayCustom(String str, String prefix, String suffix) 
    {
        System.out.println(prefix + str + suffix);
    }

    public static void main(String[] args) 
    {
        String_display stringDisplay = new String_display();

        String myString = "Hello, World!";

        stringDisplay.displayOriginal(myString);

        stringDisplay.displayUppercase(myString);

        stringDisplay.displayLowercase(myString);

        stringDisplay.displayReversed(myString);

        stringDisplay.displayLength(myString);

        stringDisplay.displayCustom(myString, "<<<", ">>>");
    }
}
