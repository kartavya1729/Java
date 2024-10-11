package Lec_10;

public class matrix_ele {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        
        int target = 29;

        int[] result = findElement(matrix, target);
        
        if (result != null) 
        {
            System.out.println("Element found at: (" + result[0] + ", " + result[1] + ")");
        } 
        
        else 
        {
            System.out.println("Element not found in the matrix.");
        }
    }

    public static int[] findElement(int[][] matrix, int target) 
    {
        if (matrix == null || matrix.length == 0) 
        {
            return null;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                if (matrix[i][j] == target) 
                {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}

