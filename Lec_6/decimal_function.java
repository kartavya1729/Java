package Lec_6;

import java.util.Scanner;

public class decimal_function 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();
        
        int binaryNumber = decimalToBinary(decimalNumber);
        
        System.out.println("Binary equivalent: " + binaryNumber);
    }

    public static int decimalToBinary(int n) 
    {
        int sum = 0;
        int mul = 1;

        while (n > 0) 
        {
            int rem = n % 2;
            
            sum += rem * mul;
            
            n = n / 2;
            
            mul = mul * 10;
        }
        
        return sum;
    }
}
