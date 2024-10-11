    
public class firstLetterCapital {
    public static void main(String[] args) 
    {
        System.out.println("hello woRld");
    }

    static String capitalizeFirstChar(String str)
    {
        String[] arr = str.split("\\s+");
        StringBuffer capString = new StringBuffer();
        
        for(String word : arr)
        {
            capString.append(Character.toUpperCase(word.charAt(0)));
            String temp = word.substring(1);
            capString.append(temp.toLowerCase());
            capString.append(" ");
        }
        return capString.toString().trim();
    }
}
