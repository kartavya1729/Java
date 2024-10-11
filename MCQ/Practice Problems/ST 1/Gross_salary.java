// package Practice Problems;

import java.util.Scanner;

 public class Gross_salary 
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input the basic salary
        System.out.print("Enter the basic salary of the employee: ");

        double basicSalary = scanner.nextDouble();

        // Calculate HRA (House Rent Allowance) as 20% of basic salary
        double hra = 0.20 * basicSalary;

        // Calculate DA (Dearness Allowance) as 50% of basic salary
        double da = 0.50 * basicSalary;

        // Calculate gross salary
        double grossSalary = basicSalary + hra + da;

        // Output the results
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (50%): " + da);
        System.out.println("Gross Salary: " + grossSalary);

        scanner.close();
    }
}