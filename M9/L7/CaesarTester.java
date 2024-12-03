package M9.L7;

import java.util.Scanner;

public class CaesarTester {
    private static int shiftKey;
    private static boolean exit = false;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ceaser Cipher");
        while (shiftKey < 0 || shiftKey > 25) {
            if (shiftKey < 0) {
                System.out.println("Shift key cannot be negative.");
            } else if (shiftKey > 25) {
                System.out.println("Shift key cannot be greater than 25.");
            }
            System.out.print("Enter a shift key between 0 and 25: ");
            shiftKey = in.nextInt();
            in.nextLine(); // consume the newline
        }
        System.out.println("Shift key: " + shiftKey);
        while (exit == false) {
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            in.nextLine(); // consume the newline
            while (choice < 1 || choice > 3) {
                System.out.println("Invalid choice.");
                System.out.print("Enter your choice: ");
                choice = in.nextInt();
                in.nextLine(); // consume the newline
            }
            // i cannot use switch case as it is not allowed in this assignment
            if (choice == 1) {
                System.out.print("Enter the text to encrypt: ");
                String text = in.nextLine();
                System.out.println("Encrypted text: " + Encryption.encrypt(text, shiftKey));
            } else if (choice == 2) {
                System.out.print("Enter the text to decrypt: ");
                String text = in.nextLine();
                System.out.println("Decrypted text: " + Decryption.decrypt(text, shiftKey));
            } else if (choice == 3) {
                exit = true;
            }


        }
    }
}
