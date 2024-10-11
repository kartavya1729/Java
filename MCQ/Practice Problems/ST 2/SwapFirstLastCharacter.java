    public class SwapFirstLastCharacter 
    {
    public static String swapFirstLast(String str) 
    {
        String[] words = str.split("\\s+");

        StringBuilder swapped = new StringBuilder();

        for (String word : words) 
        {
            if (word.length() > 1) 
            {
                String swappedWord = word.charAt(word.length() - 1) + word.substring(1, word.length() - 1) + word.charAt(0);

                swapped.append(swappedWord).append(" ");
            } 

            else 
            {
                swapped.append(word).append(" ");
            }
        }

        return swapped.toString().trim();
    }

    public static void main(String[] args) 
    {
        String sentence = "hello world java";

        String result = swapFirstLast(sentence);

        System.out.println("Original: " + sentence);
        
        System.out.println("Swapped: " + result);
    }
}
