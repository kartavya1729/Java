public class string_add 
{
    public static void main(String[] args) 
    {
        String s1 = " Chitkara ";

        String s2 = " University ";
        
        String s3 = s1 + s2; // Simple Addition 

        String s4 = s1.concat(s2); // using concatenate inbuilt method

        System.out.println(s3);

        System.out.println(s4);

        String s5 = s3 + "G - 10"; // using Literals 

        String s6 = " G - 10 " + " G - 9";

        System.out.println(s5);

        System.out.println(s6);

        System.out.println("Hello " + 4 + 2 + " G10 ");

        System.out.println( 4 + 10 +" Hello " + " G10 ");

    }
}