public class string_cons 
{
    public static void main(String[] args) 
    {
        String s1 = "hello";

        String s2 = new String("G 10");

        char []arr1 = {'a', 'b', 'c', 'd', 'e'};

        String s3 = new String(arr1);

        byte[] arr2 = {66, 70, 74, 80};

        String s4 = new String(arr2);

        System.out.println(s1);

        System.out.println(s2);

        System.out.println(s3);

        System.out.println(s4);
        

        // int[] arr3 = {66, 70, 74, 80};

        // String s5 = new String(arr3);

    }
}
