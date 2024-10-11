
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int age;
        Scanner sc =new Scanner(System.in);
        age = sc.nextInt();
        sc.close();

        try
        {
            if(age < 0)
                throw new Exception("Age can not be negative");
            System.out.println("Correct Age");
        }

        catch(Exception e){
            System.out.println("Age can be positive only");
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}