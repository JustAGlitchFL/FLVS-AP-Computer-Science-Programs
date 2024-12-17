/**
 * This is a class that tests the Card class.
 *
 *  Aidan Procopio
 *  12/15/24
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);
      Card threeDiamonds = new Card("three", "diamonds", 3);
      Card jackClubs = new Card("jack", "clubs", 11);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      System.out.println("**** Tests Card 2: three of diamonds ****");
      System.out.println("  rank: " + threeDiamonds.rank());
      System.out.println("  suit: " + threeDiamonds.suit());
      System.out.println("  pointValue: " + threeDiamonds.pointValue());
      System.out.println("  toString: " + threeDiamonds.toString());
      System.out.println();
      // Test card 3
      System.out.println("**** Tests Card 3: jack of clubs ****");
      System.out.println("  rank: " + jackClubs.rank());
      System.out.println("  suit: " + jackClubs.suit());
      System.out.println("  pointValue: " + jackClubs.pointValue());
      System.out.println("  toString: " + jackClubs.toString());
      System.out.println();
      // Test matches() method
      System.out.println("**** Matches Tests ****");
      System.out.println("  Matching: " + aceHearts.matches(aceHearts));
      System.out.println("  Not Matching: " + aceHearts.matches(threeDiamonds));
   }
}
