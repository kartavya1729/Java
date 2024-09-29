import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks for 5 subjects (separated by spaces): ");

        int[] marks = new int[5];
        
        for (int i = 0; i < 5; i++) 
        {
            marks[i] = sc.nextInt();
        }
        
        int aggre = 0;

        for (int mark : marks) 
        {
            aggre += mark;
        }
        
        int totalMarks = 500;

        double percentage = (aggre / (double) totalMarks) * 100;
        
        System.out.println(aggre + " " + (int) Math.floor(percentage));
        
        sc.close();
    }
}