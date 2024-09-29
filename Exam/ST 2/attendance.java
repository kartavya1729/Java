import java.util.Scanner;

public class attendance 
{
    public static boolean checkAttendance(String attendanceRecord) 
    {
        int abs = 0;
        int late = 0;

        for (char record : attendanceRecord.toCharArray()) 
        {
            if (record == 'A') 
            {
                abs++;
                late = 0; // Reset late streak when absent
            } 

            else if (record == 'L') 
            {
                late++;
            } 

            else 
            {
                late = 0; // Reset late streak for presence ('P')
            }

            if (abs > 1 || late == 3) 
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student's attendance record (e.g., P for present, A for absent, L for late): ");
        String attendanceRecord = sc.nextLine().toUpperCase();

        boolean isEligible = checkAttendance(attendanceRecord);

        if (isEligible) 
        {
            System.out.println("The student meets the attendance criteria.");
        } 

        else 
        {
            System.out.println("The student does not meet the attendance criteria.");
        }

        sc.close();
    }
}