public class missing_ele 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        
        int n = arr.length + 1; 
        
        int totalSum = n * (n + 1) / 2;
        
        int arraySum = 0;
        
        for (int i = 0; i < arr.length; i++) 
        {
            arraySum += arr[i];
        }
        
        int missingNumber = totalSum - arraySum;
        
        System.out.println("The missing number is: " + missingNumber);
    }
}

// public class missing_ele 
// {
//     public static int findMissingElement(int[] array1, int[] array2) 
//     {
//         int sum1 = 0, sum2 = 0;

//         for (int num : array1) 
//         {
//             sum1 += num;
//         }

//         for (int num : array2) 
//         {
//             sum2 += num;
//         }

//         return sum1 - sum2;
//     }

//     public static void main(String[] args) 
//     {
//         int[] array1 = {3, 7, 1, 2, 8, 4, 5}; // Array with all elements

//         int[] array2 = {3, 7, 2, 1, 4, 5};   // Array missing one element

//         int missingElement = findMissingElement(array1, array2);

//         System.out.println("The missing element is: " + missingElement);
//     }
// }

