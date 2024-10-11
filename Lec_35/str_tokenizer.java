
import java.util.StringTokenizer;

public class str_tokenizer 
{
    public static void main(String[] args) 
    {
        StringTokenizer st1 = new StringTokenizer("Hello,World",",");

        while(st1.hasMoreTokens())
        {
            System.out.println(st1.nextToken());
        }


        StringTokenizer st2 = new StringTokenizer("Hello World");

        while(st2.hasMoreTokens())
        {
            System.out.println(st2.nextToken());
        }

        
        StringTokenizer st3 = new StringTokenizer("Hello World"," ",true);
        while(st3.hasMoreTokens())
        {
            System.out.println(st3.nextToken());
        }
    }
}