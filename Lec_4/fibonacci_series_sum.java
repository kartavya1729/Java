package Lec_4;

import java.util.Scanner;

public class fibonacci_series_sum
{
    public static void main(String[] args) 
    {
        int n, a = 0, b = 1;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter value of n: ");
        
        n = s.nextInt();
        
        System.out.print("Fibonacci Series: ");
        
        for(int i=0; i<=n-2; i++)
        {
            int sum = a+b;
            a = b;
            b = sum;
        }

        System.out.println(a);
    }
}
