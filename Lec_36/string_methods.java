
public class string_methods 
{
    public static void main(String[] args) 
    {
        //Sample String
        String str = "Hello, World!";
        //            0123456789101112
        System.out.println("Substring from index 7: " + str.substring(7));
        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));

        System.out.println("Contains 'World': " + str.contains("World"));

        System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!"));
        System.out.println("Equals 'hello, world!' ignoring case: " + str.equalsIgnoreCase("hello, world!"));

        System.out.println("Is empty: " + str.isEmpty());

        System.out.println("To uppercase: " + str.toUpperCase());
        System.out.println("To lowercase: " + str.toLowerCase());

        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        String repeatedStr = "ababc";
        System.out.println("Index of 'ababc': " + repeatedStr.indexOf("ab"));

        repeatedStr = "ababc";
        System.out.println("Last index of 'ab': " + repeatedStr.lastIndexOf("ab"));

        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with 'World!': " + str.endsWith("World!"));

        int number = 123;
        String numberStr = String.valueOf(number);//"123"
        System.out.println("String value of 123: " + numberStr);


        String formattedString = String.format("My name is %s and I am %d years old.", "John", 25);
        System.out.println("Formatted string: " + formattedString);


        String pattern = "Hello, [a-zA-Z]+!";
        System.out.println("Matches pattern: " + str.matches(pattern));

        
        String internedStr = str.intern();
        System.out.println("Interned string: " + internedStr);

    }
}