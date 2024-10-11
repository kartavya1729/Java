    
import java.util.ArrayList;

public class str_buffer_demo 
{
    public static void main(String[] args) 
    {
        StringBuffer s1 = new StringBuffer();
        System.out.println(s1.capacity());
        System.out.println(s1.length());


        StringBuffer sb2 = new StringBuffer(50);

        System.out.println(sb2.capacity());
        System.out.println(sb2);


        StringBuffer sb3 = new StringBuffer("G10");
        System.out.println(sb3.capacity());
        System.out.println(sb3);


        String s2 = " hello ";
        s2.trim();
        System.out.println(s2);

        System.out.println(System.identityHashCode(sb3));
        sb3.append(" Chitkara");
        System.out.println(sb3);
        System.out.println(System.identityHashCode(sb3));

        //"G10 Chitkara"
        sb3.insert(3,"Bye");
        System.out.println(sb3);

        sb3.delete(3,6);
        System.out.println(sb3);

        //ending index not included "G10 Chitkara"
        sb3.replace(0,2,"G9");
        System.out.println(sb3);

        System.out.println(sb3.capacity());
        //(old capacity * 2) + 2
    }
}
