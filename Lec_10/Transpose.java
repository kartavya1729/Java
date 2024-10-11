package Lec_10;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the dimensions of the matrix
        System.out.print("Enter the number of rows/columns (matrix should be square): ");
        int n = sc.nextInt(); // assuming the matrix is square

        int[][] matrix = new int[n][n];

        // Input the matrix elements
        System.out.print("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Compute transpose using swapping
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println(); // next line

        // Print the transposed matrix
        System.out.println("Transposed Matrix: ");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // next line
        }
    }
}
















//package july_31;
//
//import java.util.Scanner;
//
//public class Transpose 
//{
//    public static void main(String[] args) 
//    {
//        Scanner sc = new Scanner(System.in);
//
//        // Get the dimensions of the matrix
//        System.out.print("Enter the number of rows: ");
//        int rows = sc.nextInt();
//        
//        System.out.print("Enter the number of columns: ");
//        int cols = sc.nextInt();
//
//        int[][] matrix = new int[rows][cols];
//        
//        int[][] transpose = new int[cols][rows];
//
//        // Input the matrix elements
//        System.out.print("Enter the elements of the matrix: ");
//        for (int i = 0; i < rows; i++) 
//        {
//            for (int j = 0; j < cols; j++) 
//            {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//
//        // Compute the transpose
//        for (int i = 0; i < rows; i++) 
//        {
//            for (int j = 0; j < cols; j++) 
//            {
//                transpose[j][i] = matrix[i][j];
//            }
//        }
//        
//        System.out.println(); // next line
//
//        // Print the original matrix
//        System.out.println("Original Matrix: ");
//        for (int i = 0; i < rows; i++) 
//        {
//            for (int j = 0; j < cols; j++) 
//            {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println(); // next line
//        }
//        
//        System.out.println(); // next line

        // Print the transposed matrix
//        System.out.println("Transposed Matrix: ");
//        for (int i = 0; i < cols; i++) 
//        {
//            for (int j = 0; j < rows; j++) 
//            {
//                System.out.print(transpose[i][j] + " ");
//            }
//            System.out.println(); // next line
//        }
//
//        sc.close();
//    }
//}

