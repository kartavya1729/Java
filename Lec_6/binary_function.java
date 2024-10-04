package Lec_6;

import java.util.Scanner;

public class binary_function 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a binary number: ");
        
        int binaryNumber = sc.nextInt();
        
        int decimalNumber = binaryToDecimal(binaryNumber);
        
        System.out.println("Decimal equivalent: " + decimalNumber);
    }

    public static int binaryToDecimal(int n) 
    {
        int sum = 0;
        
        int mul = 1; // 2^0 is 1

        while (n > 0) 
        {
            int rem = n % 10;
            
            sum += rem * mul;
            
            n = n / 10;
            
            mul = mul * 2;
        }

        return sum;
    }
}
