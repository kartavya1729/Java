
import java.util.Scanner;

public class attendanceRecord 
{
    public static boolean checkRecord(String s) 
    {
        int absentCount = 0;

        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);

            if (ch == 'A') 
            {
                absentCount++;

                if (absentCount > 1) 
                {
                    return false;
                }
            }

            if (ch == 'L' && i > 1 && s.charAt(i - 1) == 'L' && s.charAt(i - 2) == 'L') {
                return false;
            }
        }
        return true;
    }
}