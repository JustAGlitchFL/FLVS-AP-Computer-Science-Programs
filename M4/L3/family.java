
/**
 * 
 * This program analyzes data from a file and prints the results.
 *
 * @author Aidan Procopio
 * @version 07/14/2024
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class family
{
    public static void main(String[] args) throws IOException
    {
        String token = "";
        File fileName = new File("familymembers.txt");
        Scanner inFile = new Scanner(fileName);
        int bb = 0;
        int gg = 0;
        int gb = 0;
        int total = 0;

        while (inFile.hasNextLine())
        {
            token = inFile.nextLine();
            if (token.equalsIgnoreCase("bb")){
                bb++;
            }else if (token.equalsIgnoreCase("gg")){
                gg++;
            }else if (token.equalsIgnoreCase("gb") || token.equalsIgnoreCase("bg")){
                gb++;
            } 
            total++;
        }
        inFile.close();
        int bbPercent = (bb * 100) / total;
        int ggPercent = (gg * 100) / total;
        int gbPercent = (gb * 100) / total;

        System.out.println("Composition statistics for families with two children:");
        System.out.println("\nTotal number of families: " + total);
        System.out.println("\nNumber of families with:");
        System.out.println("2 boys: " + bb + " represents " + bbPercent + "%");
        System.out.println("2 girls: " + gg + " represents " + ggPercent + "%");
        System.out.println("1 boy and 1 girl: " + gb + " represents " + gbPercent + "%");


    }
}