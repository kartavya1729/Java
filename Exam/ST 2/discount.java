import java.util.Scanner;

public class discount 
{
    public static double[] applyDiscount(double[] prices, double discountPercentage) 
    {
        double discountFactor = 1 - (discountPercentage / 100);

        double[] discountedPrices = new double[prices.length];

        for (int i = 0; i < prices.length; i++) 
        {
            discountedPrices[i] = prices[i] * discountFactor;
        }
        return discountedPrices;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of prices: ");
        int n = sc.nextInt();

        double[] prices = new double[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter price " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
        }

        System.out.print("Enter the discount percentage: ");
        double discountPercentage = sc.nextDouble();

        double[] discountedPrices = applyDiscount(prices, discountPercentage);

        System.out.println("Prices after applying " + discountPercentage + "% discount:");

        for (int i = 0; i < discountedPrices.length; i++) 
        {
            System.out.printf("Price %d: %.2f\n", i + 1, discountedPrices[i]);
        }

        sc.close();
    }
}