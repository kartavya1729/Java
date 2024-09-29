public class capitalize 
{
    public static String capitalizeFirstLetter(String str) 
    {
        // Split string  using space as a delimiter

        String[] words = str.split("\\s+");

        StringBuilder capitalized = new StringBuilder();

        for (String word : words) 
        {
            if (word.length() > 0) 
            {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1).toLowerCase())
                           .append(" ");
            }
        }

        return capitalized.toString().trim();
    }

    public static void main(String[] args) 
    {
        String sentence = "hello world! welcome to java programming.";

        String result = capitalizeFirstLetter(sentence);

        System.out.println("Original: " + sentence);
        
        System.out.println("Capitalized: " + result);
    }
}
