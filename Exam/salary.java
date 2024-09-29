import java.util.Scanner;

public class salary {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the basic salary: ");
        double basicSal = sc.nextDouble();
        
        if(basicSal >= 100) 
        {

            double HRA = 0.10 * basicSal;
            
            double DA = 0.20 * basicSal;
            
            double grossSalary = basicSal + HRA + DA;
            
            System.out.println("Gross Salary: " + grossSalary);
        } 

        else 
        {
            System.out.println("Basic salary should be at least 100.");
        }
        
        sc.close();
    }
}