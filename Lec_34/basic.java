public class basic {

    public static void main(String[] args) 
    {
        String  s1 = "hello";
        
        String  s2 = "hello";
        
        String  s3 = "Hello";
        
        String s4 = new String("hello");
        
        String s5 = new String("hello");
        
        // System.out.println(System.identityHashCode(s1));

        // System.out.println(System.identityHashCode(s2));
    
        // System.out.println(System.identityHashCode(s3));

        // System.out.println(System.identityHashCode(s4));

        // System.out.println(System.identityHashCode(s5));

        int a = 5, b = 10;

        System.out.println(a == b); // comparing content of a and b

        // checking if both reference variable pointing to same memory address

        System.out.println(s1 == s2);

        System.out.println(s1 == s3);

        System.out.println(s2 == s4);

        System.out.println(s4 == s5);

        int [] arr = new int[5];
        
        System.out.println(arr.length);

        System.out.println(s1.length());



    }
}