import java.util.Scanner;

public class Matrix_multi 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input  first matrix
        System.out.print("Enter the number of rows in the first matrix: ");
        int rows1 = scanner.nextInt();

        System.out.print("Enter the number of columns in the first matrix: ");
        int cols1 = scanner.nextInt();

        // Input second matrix
        System.out.print("Enter the number of rows in the second matrix: ");
        int rows2 = scanner.nextInt();

        System.out.print("Enter the number of columns in the second matrix: ");
        int cols2 = scanner.nextInt();

        // Check if the matrices can be multiplied
        if (cols1 != rows2) 
        {
            System.out.println("Matrix multiplication is not possible. Number of columns in the first matrix must equal the number of rows in the second matrix.");
            return;
        }

        // Input the first matrix
        int[][] matrix1 = new int[rows1][cols1];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) 
        {
            for (int j = 0; j < cols1; j++) 
            {
                matrix1[i][j] = scanner.nextInt();  // Correct assignment of elements to matrix1
            }
        }

        // Input the second matrix
        int[][] matrix2 = new int[rows2][cols2];

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) 
        {
            for (int j = 0; j < cols2; j++) 
            {
                matrix2[i][j] = scanner.nextInt();  // Correct assignment of elements to matrix2
            }
        }

        // Resultant matrix after multiplication
        int[][] result = new int[rows1][cols2];

        // Multiply the matrices
        for (int i = 0; i < rows1; i++) 
        {
            for (int j = 0; j < cols2; j++) 
            {
                for (int k = 0; k < cols1; k++) 
                {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Output the result
        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < rows1; i++) 
        {
            for (int j = 0; j < cols2; j++) 
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
