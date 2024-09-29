import java.util.Scanner;

public class strange_ele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input the array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the two odd-occurring elements
        findTwoOddElements(arr);

        scanner.close();
    }

    public static void findTwoOddElements(int[] arr) 
    {
        int xor = 0;

        // Step 1: Find XOR of all elements
        for (int num : arr) {
            xor ^= num;
        }

        // Step 2: Find the rightmost set bit in the XOR result
        int rightmostSetBit = xor & -xor;

        int odd1 = 0, odd2 = 0;

        // Step 3: Divide elements into two groups based on the rightmost set bit
        for (int num : arr) 
        {
            if ((num & rightmostSetBit) != 0) {
                odd1 ^= num;  // XOR for the first group
            } 
            else {
                odd2 ^= num;  // XOR for the second group
            }
        }

        if (odd1 < odd2) {
            System.out.println("The two odd-occurring elements are: " + odd1 + " and " + odd2);
        } 
        else {
            System.out.println("The two odd-occurring elements are: " + odd2 + " and " + odd1);
        }
    }
}
