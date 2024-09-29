import java.util.Scanner;

public class StudentMarks 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int numSubjects = 5;         // Number of subjects

        int totalMarks = numSubjects * 100; // Assuming each subject is out of 100

        // Array to store marks for each subject
        int[] marks = new int[numSubjects];

        // Input marks for each subject
        System.out.println("Enter the marks for " + numSubjects + " subjects:");
        for (int i = 0; i < numSubjects; i++) 
        {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate aggregate marks
        int aggregateMarks = 0;

        for (int mark : marks) 
        {
            aggregateMarks += mark;
        }

        // Calculate percentage
        double percentage = (double) aggregateMarks / totalMarks * 100;

        // Output the results
        System.out.println("Aggregate Marks: " + aggregateMarks);

        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}