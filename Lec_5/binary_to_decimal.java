package Lec_5;

import java.util.Scanner; 

public class binary_to_decimal 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt(); 

		int sum = 0; 

		int mul = 1; // Taking 1, because 10 to the power 0 is considered as 1; 

		while (n > 0) { // Running loop until our n becomes 0 

		int rem = n % 10; 

		sum += rem * mul; 

		n = n / 10; 

		mul = mul * 2; 

		} 

		System.out.println(sum); 
	}

}
