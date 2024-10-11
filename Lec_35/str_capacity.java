    
public class str_capacity 
{
    public static void main(String[] args) 
    {
        StringBuffer s1 = new StringBuffer("Hello");

        System.out.println(s1.capacity());

        //(old capacity + 1) * 2
        s1.append("java is my favourite language");

        System.out.println(s1.capacity());
    }
}
