class InvalidEmailException extends Exception 
{
    public InvalidEmailException(String message) 
    {
        super(message);
    }
}

public class EmailValidator 
{
    public static void validateEmail(String email) throws InvalidEmailException 
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        if (!email.matches(emailRegex)) 
        {
            throw new InvalidEmailException("Invalid email address: " + email);
        } 

        else 
        {
            System.out.println("Email is valid.");
        }
    }

    public static void main(String[] args) 
    {
        String email = "invalid.email@domain";

        try 
        {
            validateEmail(email);
        } 

        catch (InvalidEmailException e) 
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}