import java.util.Scanner;

public class election_winner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int testCases = scanner.nextInt();

        for (int t = 0; t < testCases; t++) 
        {
            System.out.print("Enter the number of constituencies for test case " + (t + 1) + ": ");
            int n = scanner.nextInt();

            int[] votes = new int[n];
            System.out.println("Enter the candidate numbers for " + n + " constituencies: ");
            
            for (int i = 0; i < n; i++) 
            {
                votes[i] = scanner.nextInt();
            }

            int candidate = findMajorityCandidate(votes, n);

            int count = 0;

            for (int vote : votes) 
            {
                if (vote == candidate) 
                {
                    count++;
                }
            }

            if (count > n / 2) 
            {
                System.out.println("Winner for test case " + (t + 1) + " is candidate " + candidate);
            } 

            else 
            {
                System.out.println("No clear winner for test case " + (t + 1) + " (output -1)");
            }
        }

        scanner.close();
    }

    public static int findMajorityCandidate(int[] votes, int n) 
    {
        int candidate = votes[0];

        int count = 1;

        for (int i = 1; i < n; i++) 
        {
            if (votes[i] == candidate) 
            {
                count++;
            } 

            else 
            {
                count--;
            }

            if (count == 0) 
            {
                candidate = votes[i];
                count = 1;
            }
        }

        return candidate;
    }
}