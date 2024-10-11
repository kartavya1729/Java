package String;

import java.util.Scanner;

public class multipy_str 
{
    public static String multiply(String num1, String num2) 
    {
        if (num1.equals("0") || num2.equals("0")) 
        {
            return "0";
        }

        int[] res = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) 
        {
            for (int j = num2.length() - 1; j >= 0; j--) 
            {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                int sum = mul + res[i + j + 1];

                res[i + j + 1] = sum % 10;
                res[i + j] += sum / 10;
            }
        }

        StringBuilder resultStr = new StringBuilder();

        for (int num : res) 
        {
            if (!(resultStr.length() == 0 && num == 0)) 
            {
                resultStr.append(num);
            }
        }
        return resultStr.toString();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number as string: ");
        String num1 = sc.nextLine();

        System.out.print("Enter second number as string: ");
        String num2 = sc.nextLine();

        String result = multiply(num1, num2);
        System.out.println("Product of the numbers: " + result);

        sc.close();
    }
}