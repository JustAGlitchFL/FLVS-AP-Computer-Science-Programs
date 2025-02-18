package M9.L7;
/**
 * This class provides a method to decrypt text using the Caesar cipher.
 * @author Aidan Procopio
 * @version 12/3/24
 */
public class Decryption {
    public static final char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public static String decrypt(String text, int shiftKey) {
        char[] textArray = text.toUpperCase().toCharArray();
        char[] decryptedArray = new char[textArray.length];
        for (int i = 0; i < textArray.length; i++) {
            if (Character.isLetter(textArray[i])) {
                int j = textArray[i] - 'A';
                j = (j - shiftKey + 26) % 26;
                decryptedArray[i] = alphabet[j];
            } else {
                decryptedArray[i] = textArray[i];
            }
        }
        return new String(decryptedArray);
    }
}
