import java.util.ArrayList;
import java.util.List;

public class Spiral_matrix 
{
    public static List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) 
        {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) 
            {
                result.add(matrix[top][i]);
            }

            top++; // Move down to the next row

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) 
            {
                result.add(matrix[i][right]);
            }

            right--; // Move left to the next column

            if (top <= bottom) 
            {
                // Traverse from right to left along the bottom row
                for (int i = right; i >= left; i--) 
                {
                    result.add(matrix[bottom][i]);
                }

                bottom--; // Move up to the previous row
            }

            if (left <= right) 
            {
                // Traverse from bottom to top along the left column
                for (int i = bottom; i >= top; i--) 
                {
                    result.add(matrix[i][left]);
                }
                
                left++; // Move right to the next column
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> result = spiralOrder(matrix);
        System.out.println(result); // Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }
}
