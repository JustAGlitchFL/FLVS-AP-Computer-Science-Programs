package M4.L3;
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
public class familyrev2
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

        while (inFile.hasNext())
        {
            token = inFile.next();
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
        double bbPercent = (bb * 100.000) / total;
        double ggPercent = (gg * 100.000) / total;
        double gbPercent = (gb * 100.000) / total;

        //rounding to 2 decimal places
        bbPercent = (int)(bbPercent * 100.0 + 0.5) / 100.0;
        ggPercent = (int)(ggPercent * 100.0 + 0.5) / 100.0;
        gbPercent = (int)(gbPercent * 100.0 + 0.5) / 100.0;

        System.out.println("Composition statistics for families with two children:");
        System.out.println("\nTotal number of families: " + total);
        System.out.println("\nNumber of families with:");
        System.out.println("2 boys: " + bb + " represents " + bbPercent + "%");
        System.out.println("2 girls: " + gg + " represents " + ggPercent + "%");
        System.out.println("1 boy and 1 girl: " + gb + " represents " + gbPercent + "%");


    }
}