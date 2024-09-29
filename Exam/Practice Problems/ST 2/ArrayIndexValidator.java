class InvalidIndexException extends Exception 
{
    public InvalidIndexException(String message) 
    {
        super(message);
    }
}

public class ArrayIndexValidator 
{
    public static void validateIndex(int[] arr, int index) throws InvalidIndexException 
    {
        if (index < 0 || index >= arr.length) 
        {
            throw new InvalidIndexException("Invalid index: " + index + ". Valid indices are between 0 and " + (arr.length - 1));
        } 

        else 
        {
            System.out.println("Valid index: " + index + ". Element at index: " + arr[index]);
        }
    }

    public static void main(String[] args) 
    {
        int[] numbers = {10, 20, 30, 40, 50};

        int indexToCheck = 7;

        try 
        {
            validateIndex(numbers, indexToCheck);
        } 

        catch (InvalidIndexException e) 
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}