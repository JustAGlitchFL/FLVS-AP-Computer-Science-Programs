package M9.L7;
/**
 * This class provides a method to encrypt text using the Caesar cipher.
 * @author Aidan Procopio
 * @version 12/3/24
 */

public class Encryption {
    public static final char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static String encrypt(String text, int shiftKey) {
        char[] textArray = text.toUpperCase().toCharArray();
        char[] encryptedArray = new char[textArray.length];
        for (int i = 0; i < textArray.length; i++) {
            if (Character.isLetter(textArray[i])) {
                int j = textArray[i] - 'A';
                j = (j + shiftKey) % 26;
                encryptedArray[i] = alphabet[j];
            } else {
                encryptedArray[i] = textArray[i];
            }
        }
        return new String(encryptedArray);
    }
}
