import java.util.Scanner;

public class Caesar_cipher 
{
    public static String encrypt(String text, int shift) 
    {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) 
        {
            char ch = text.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                char encryptedChar = (char) ((ch + shift - 'A') % 26 + 'A');
                result.append(encryptedChar);
            }

            else if (Character.isLowerCase(ch)) 
            {
                char encryptedChar = (char) ((ch + shift - 'a') % 26 + 'a');
                result.append(encryptedChar);
            } 
            else 
            {
                // Non-alphabetic characters are added unchanged
                result.append(ch);
            }
        }
        
        return result.toString();
    }

    // Method to decrypt the ciphertext
    public static String decrypt(String text, int shift) 
    {
        return encrypt(text, 26 - shift);  // Decrypt by shifting in the opposite direction
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text to encrypt: ");
        String text = sc.nextLine();

        System.out.print("Enter the shift value (1-25): ");
        int shift = sc.nextInt();

        String encryptedText = encrypt(text, shift);
        System.out.println("Encrypted Text: " + encryptedText);

        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Decrypted Text: " + decryptedText);

        sc.close();
    }
}