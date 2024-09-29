
import java.util.Scanner;

public class Time_conversion 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        long totalSeconds = scanner.nextLong();

        // Calculate days
        long days = totalSeconds / (24 * 3600);
        totalSeconds %= (24 * 3600);

        // Calculate hours
        long hours = totalSeconds / 3600;
        totalSeconds %= 3600;

        // Calculate minutes
        long minutes = totalSeconds / 60;

        // Calculate seconds
        long seconds = totalSeconds % 60;

        scanner.close();

        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}