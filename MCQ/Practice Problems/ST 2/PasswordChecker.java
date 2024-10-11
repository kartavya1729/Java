    
class PasswordTooShortException extends Exception 
{
    public PasswordTooShortException(String message) 
    {
        super(message);
    }
}

public class PasswordChecker 
{
    public static void checkPassword(String password) throws PasswordTooShortException 
    {
        int minLength = 8;

        if (password.length() < minLength) 
        {
            throw new PasswordTooShortException("Password is too short! Must be at least " + minLength + " characters.");
        } 

        else 
        {
            System.out.println("Password is valid.");
        }
    }

    public static void main(String[] args) 
    {
        String password = "pass123";

        try 
        {
            checkPassword(password);
        } 
        catch (PasswordTooShortException e) 
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}