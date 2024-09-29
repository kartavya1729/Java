import java.util.Scanner;

public class LeapYearCheck 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a year (between 1001 and 9999): ");
        int year = sc.nextInt();
        
        if (year > 1000 && year < 10000) 
        {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
            {
                System.out.println("Leap Year");
            } 

            else 
            {
                System.out.println("Not a Leap Year");
            }
        } 

        else 
        {
            System.out.println("Year is out of the valid range.");
        }
        
        sc.close();
    }
}
