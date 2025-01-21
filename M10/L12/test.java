import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String[][] letters = {{"A", "B", "C", "D"}, {"E", "F", "G", "H"}, {"I", "J", "K", "L"}};

   for(int x = 1; x<letters[0].length; x++){
      for(int y = 1; y<letters.length; y++){
         System.out.print(letters[y][x] + " ");
      }
   }
    }
}
