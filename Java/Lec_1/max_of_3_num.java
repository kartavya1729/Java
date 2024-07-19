package Lec_1;

public class max_of_3_num 
{
    public static void main(String[] args) 
	{
		int A = 7 ,B = 5, C = 3;
		
		if (A > B  && A > C)
		{
			System.out.println(A);
		}
		
		else if (B > A && B > C)
		{
			System.out.println(B);
		}
		
		else 
		{
			System.out.println(C);
		}
    }
}
