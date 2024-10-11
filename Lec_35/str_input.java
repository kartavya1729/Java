import java.util.Scanner;

public class str_input
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int a;
        a = sc.nextInt();
        System.out.println(a);

        String s1;
        s1 = sc.next();
        System.out.println(s1);

//      s1 = sc.nextLine();
//      System.out.println(s1);
//
//        //"     Hello    G10    "
        s1 = "     Hello    G10    ";
        System.out.println(s1);
        System.out.println(s1.trim());


        String s2 = "Chitkara  University Punjab";
        String arr[] = s2.split("\s+");

        for(String word : arr)
        {
            System.out.println(word);
        }
        sc.close();
    }
}