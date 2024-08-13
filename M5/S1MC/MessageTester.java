package M5.S1MC;

public class MessageTester {
    public static void main(String[] args) {
        Message msg1 = new Message("08 abc123xy 16 Computer Science"); //creates a new message object
        boolean msg1Valid = msg1.isValid(); // returns true for a valid message
        System.out.println(msg1Valid);
        System.out.println(msg1.wordCount());
        String text = "11 radio11a287 14";
        Message msg2 = new Message(text);
        boolean msg2Valid = msg2.isValid(); // returns false for an invalid message
        System.out.println(msg2Valid);
        Message msg3 = new Message("04 92a1 16 Computer Science");
        Message msg4 = new Message("03 x8r 21 Today is a great day!");
        int numWords = msg4.wordCount(); //returns 5, the number of words in the
        //text message
        System.out.println(numWords);
    }
}
