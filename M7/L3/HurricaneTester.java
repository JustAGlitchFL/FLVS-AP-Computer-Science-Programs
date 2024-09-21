/**
 * Starter code for the Hurricane Tester
 * APCS Team 2020
 *
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
        File fileName = new File("hurricanedata.txt");
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
        }
		
		//convert the values in the windspeed array to MPH, use the converted windspeeds to fill the categories array
		
		
		//user prompted for range of years
        Scanner input = new Scanner(System.in); //scanner used to prompt input for year range
        System.out.print("Enter the starting year: ");
        int startYear = input.nextInt();
        input.nextLine();
        System.out.print("Enter the ending year: ");
        int endYear = input.nextInt();
        input.nextLine();

        
		//create a Hurricane ArrayList of hurricane objects that are in the user's requested range
		
        ArrayList <Hurricane> hurricanes = new ArrayList<Hurricane>();
        
		//print the hurricanes in the user's requested range
		
        System.out.printf("Hurricanes %4d - %4d\n", startYear, endYear);

		//calculate and display the summary data using the ArrayList
     }
}