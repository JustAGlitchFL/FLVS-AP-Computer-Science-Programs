package M6.DBA;
/**
 * A program to check if a word is in an array.
 * @author Aidan Procopio
 * @version 8/27/2024
 */

public class WordChecker {
    // instance variable myWords contains an array of String values storing the words from the phrase - where each element is a single word.
    // The instance variable myNumWords is a count validation to confirm the number of words found in the phrase. 
    // The instance variable myTargetWord contains a target word is to be located in the array
    // The constructor accepts a String array with the words, an int representing the number of words in the phrase and a String representing the target word.
    // There may be other instance variables, constructors and methods not shown
    private String [] myWords;
    private int myNumWords;
    private String myTargetWord;
    public WordChecker(String [] words, int numWords, String targetWord)
    {
    myWords = words;
    myNumWords = numWords;
    myTargetWord = targetWord;
    }
    public boolean isWithin()
    {
        for (String i : myWords){
            if (i.equals(myTargetWord)){
                return true;
            }
        }
        return false;
    }
    public boolean sameNumber()
    {
        if (myNumWords == myWords.length){
            return true;
        }
        return false;
    }
    public int totalChar()
    {
        int total = 0;
        for (String i : myWords){
            total += i.length();
        }
        return total;
    }
}
