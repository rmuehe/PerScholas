package glab_303_3_2;
import java.util.Scanner;
public class VigenereCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to encrypt: ");
        String text = sc.nextLine();
        System.out.print("Enter the password: ");
        String password = sc.nextLine();
        // TODO: validate for characters outside ASCII range
        StringBuffer encryptedText = new StringBuffer();
        int passLen = password.length();
        int textLen = text.length();
        // Prints out each ASCII character from the string,
        // password character in the sequence
        // and then the conversion to an encrypted ASCII character.
        for (int i = 0; i < textLen; i++) {
            char textChar = text.charAt(i);
            char passwordChar = password.charAt(i % passLen);
            char encryptedChar = (char) (((textChar + passwordChar) % 95) + 32);
            encryptedText.append(encryptedChar);
            System.out.println("Text Char: " + textChar + " (" + (int) textChar + "), Password Char: " + passwordChar +
                    " (" + (int) passwordChar + "), Encrypted Char: " + encryptedChar + " (" + (int) encryptedChar + ")");
        }
        System.out.println("Encrypted Text: " + encryptedText.toString());
        sc.close();
    }
}