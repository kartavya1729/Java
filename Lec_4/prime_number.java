package Lec_4;

import java.util.Scanner;

public class prime_number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter your number: ");

		int n = sc.nextInt();
		
		System.out.println(n);
		
		if (checkPrime(n)) 
		{  
			System.out.println(n + " is a prime number");  
		}
		
		else 
		{  
	        System.out.println(n + " is not a prime number");  
	    }  
	}
	
	public static boolean checkPrime(int n) 
	   {  
	       if (n <= 1) 
	       {  
	           return false;  
	       }  
	       
	       for (int i = 2; i < Math.sqrt(n); i++) 
	       {  
	           if (n % i == 0) 
	           {  
	               return false;  
	           }  
	       }  
	       
	       return true;  
	   }  
}