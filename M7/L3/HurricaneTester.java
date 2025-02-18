/**
 * Starter code for the Hurricane Tester
 * APCS Team 2020
 *
 * modified:
 * @author Aidan Procopio
 * @version 9/21/2024
 */
 
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class HurricaneTester

{

    public static void main(String[] args) throws IOException
    {
        //read data from text file & put in an array
        File fileName = new File("./M7/L3/hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        
        //count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        
        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];
        
        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();
        
		//create an array to store the categories for each hurricane		
		
        int [] categories = new int[numValues];
        
		//convert the values in the windspeed array to MPH, use the converted windspeeds to fill the categories array

        for (int i = 0; i < numValues; i++)
        {
            windSpeeds[i] = windSpeeds[i] * 1.15078;
        }
		for (int i = 0; i < numValues; i++)
        {
            if (windSpeeds[i] >= 74 && windSpeeds[i] <= 95)
            {
                categories[i] = 1;
            }
            else if (windSpeeds[i] >= 96 && windSpeeds[i] <= 110)
            {
                categories[i] = 2;
            }
            else if (windSpeeds[i] >= 111 && windSpeeds[i] <= 129)
            {
                categories[i] = 3;
            }
            else if (windSpeeds[i] >= 130 && windSpeeds[i] <= 156)
            {
                categories[i] = 4;
            }
            else if (windSpeeds[i] >= 157)
            {
                categories[i] = 5;
            }
            else 
            {
                categories[i] = 0; // placeholder for non-hurricanes to preserve index (should be unnecessary)
            }
        }
		
		//user prompted for range of years
        Scanner input = new Scanner(System.in); //scanner used to prompt input for year range
        System.out.print("Enter the starting year: ");
        int startYear = input.nextInt();
        input.nextLine(); // eat the line from not using println
        System.out.print("Enter the ending year: ");
        int endYear = input.nextInt();
        input.nextLine();
        input.close(); // get rid of the orange caution in vscode, also a good practice anyway
        
		//create a Hurricane ArrayList of hurricane objects that are in the user's requested range
		
        ArrayList <Hurricane> hurricanes = new ArrayList<Hurricane>();
        for (int i = 0; i < numValues; i++)
        {
            if (years[i] >= startYear && years[i] <= endYear)
            {
                hurricanes.add(new Hurricane(years[i], names[i], months[i], categories[i], pressures[i], windSpeeds[i]));
            }
        }
        
		//print the hurricanes in the user's requested range
		
        System.out.printf("%n                     Hurricanes %4d - %4d %n%n", startYear, endYear);

		//calculate and display the summary data using the ArrayList

        //making tons of variables for this
        int numHurricanes = hurricanes.size();

        double catAvg = 0;
        int catMin = Integer.MAX_VALUE; // could just do this with 5 instead of MIN_VALUE but the assigment says to so just going to do that
        int catMax = Integer.MIN_VALUE;

        double pressAvg = 0;
        int pressMin = Integer.MAX_VALUE;
        int pressMax = Integer.MIN_VALUE;

        double windAvg = 0;
        double windMin = Double.MAX_VALUE;
        double windMax = Double.MIN_VALUE;

        int cat1Sum = 0;
        int cat2Sum = 0;
        int cat3Sum = 0;
        int cat4Sum = 0;
        int cat5Sum = 0;

        for (int i = 0; i < numHurricanes; i++)
        {
            Hurricane h = hurricanes.get(i);
            catAvg += h.getCat();
            pressAvg += h.getPressure();
            windAvg += h.getWindspeed();

            if (h.getCat() < catMin)
            {
                catMin = h.getCat();
            }
            if (h.getCat() > catMax)
            {
                catMax = h.getCat();
            }

            if (h.getPressure() < pressMin)
            {
                pressMin = h.getPressure();
            }
            if (h.getPressure() > pressMax)
            {
                pressMax = h.getPressure();
            }

            if (h.getWindspeed() < windMin)
            {
                windMin = h.getWindspeed();
            }
            if (h.getWindspeed() > windMax)
            {
                windMax = h.getWindspeed();
            }

            if (h.getCat() == 1)
            {
                cat1Sum++;
            }
            else if (h.getCat() == 2)
            {
                cat2Sum++;
            }
            else if (h.getCat() == 3)
            {
                cat3Sum++;
            }
            else if (h.getCat() == 4)
            {
                cat4Sum++;
            }
            else if (h.getCat() == 5)
            {
                cat5Sum++;
            }
        }

        catAvg /= numHurricanes; // varible was the sum, now the average to save amount of variables required. else would need a catSum etc.
        pressAvg /= numHurricanes;
        windAvg /= numHurricanes;

        // printing everything based on user inputted range
        System.out.printf(" %-5s %-20s %-10s %-15s %-15s %n", "Year", "Hurricane", "Category", "Pressure (mb)", "Wind Speed (mph)");
        System.out.println("===========================================================================");

        for (Hurricane h : hurricanes)
        {
            System.out.println(h);
        }
        System.out.println("===========================================================================");

        System.out.printf("         Average: %16.1f %12.1f %16.2f %n", catAvg, pressAvg, windAvg);
        System.out.printf("         Minimum: %14d %12d %18.2f %n", catMin, pressMin, windMin);
        System.out.printf("         Maximum: %14d %12d %18.2f %n", catMax, pressMax, windMax);
        System.out.println();
        System.out.println("Summary of Categories:");
        System.out.printf("   Cat 1: %d%n", cat1Sum);
        System.out.printf("   Cat 2: %d%n", cat2Sum);
        System.out.printf("   Cat 3: %d%n", cat3Sum);
        System.out.printf("   Cat 4: %d%n", cat4Sum);
        System.out.printf("   Cat 5: %d%n", cat5Sum);
     }
}