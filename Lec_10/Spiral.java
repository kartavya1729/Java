package Lec_10;

import java.util.ArrayList;

import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get dimensions of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols]; // initializing 2 D array

        System.out.println("Enter the elements of the matrix: ");        // Input the matrix elements
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Get the spiral order elements
        ArrayList<Integer> spiralList = getSpiralOrder(matrix, rows, cols);

        // Print the matrix in spiral order in square format
        System.out.println("Spiral Pattern in Square Format: ");
        printSpiralInSquare(spiralList, rows, cols);
    }

    public static ArrayList<Integer> getSpiralOrder(int[][] matrix, int rows, int cols) 
    {
        ArrayList<Integer> spiralList = new ArrayList<>();
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) 
        {
            // Traverse from left to right
            for (int i = left; i <= right; i++) 
            {
                spiralList.add(matrix[top][i]);
            }
            top++;

            // Traverse downwards
            for (int i = top; i <= bottom; i++) 
            {
                spiralList.add(matrix[i][right]);
            }
            right--;

            // Traverse from right to left, if rows remain
            if (top <= bottom) 
            {
                for (int i = right; i >= left; i--) 
                {
                    spiralList.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse upwards, if columns remain
            if (left <= right) 
            {
                for (int i = bottom; i >= top; i--) 
                {
                    spiralList.add(matrix[i][left]);
                }
                left++;
            }
        }
        return spiralList;
    }

    public static void printSpiralInSquare(ArrayList<Integer> spiralList, int rows, int cols) 
    {
        int index = 0;
        int[][] spiralMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                if (index < spiralList.size()) 
                {
                    spiralMatrix[i][j] = spiralList.get(index++);
                } 
                else 
                {
                    spiralMatrix[i][j] = 0;  // Fill remaining cells with 0 if the list is exhausted
                }
            }
        }

        printMatrix(spiralMatrix);
    }

    public static void printMatrix(int[][] matrix) 
    {
        for (int[] row : matrix) 
        {
            for (int element : row) 
            {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}

