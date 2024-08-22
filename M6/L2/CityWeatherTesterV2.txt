package M6.L2;
/**
 * Annual Weather client class
 * 
 * @author APCS Team
 * @version Today
 */
import java.util.Scanner;
public class CityWeatherTesterV2
{
    
   
    
    // method to print results (formatting output will be done in 6.02)
    
        //Output: display table of weather data including average and total
    private static void printResults(String city, String state, String [] month, double [] temperature, double [] precipitation, String tempLabel, String precipLabel, double avgTemp, double totalPrecip){
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for( int index = 0; index < temperature.length; index++)
        {
  		//use printf to format
        System.out.printf("%3s %15.1f %20.1f\n", month[index], temperature[index], precipitation[index]);
        }
        System.out.println("***************************************************");
        System.out.printf("Average: %.1f    Total: %.1f\n", avgTemp, totalPrecip);
    }    
        
   
    
    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);  //will be used in 6.02
        String city = "Jacksonville";  //choose a city from the table provided
        String state = "Florida";  //choose a state from the table provided
  
        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};     //complete initialization of months array
        double [] temperature ={53.1,55.8,61.6,66.6,73.4,79.1,81.6,80.8,77.8,69.4,61.7,55.0};     //complete initialization of temperatures array
        double [] precipitation ={3.7,3.2,3.9,3.1,3.5,5.4,6.0,6.9,7.9,3.9,2.3,2.6};     //complete initialization of precipitation array

        /* Gainesville Data
        String city = "Gainesville";  //choose a city from the table provided
        String state = "Florida";  //choose a state from the table provided
  
        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", " Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};     //complete initialization of months array
        double [] temperature ={54.3,57.0,62.5,67.6,74.3,79.2,80.9,80.4,77.8,70.1,62.8,56.3};     //complete initialization of temperatures array
        double [] precipitation ={3.5,3.4,4.3,2.9,3.2,6.8,6.1,6.6,4.4,2.5,2.2,2.6};     //complete initialization of precipitation array
         */
    
        String tempLabel = "";
        String precipLabel = "";
        
        //instantiate CityWeatherV1 object 
        CityWeatherV2 jacksonville = new CityWeatherV2(month, temperature, precipitation);
        //print average temperature and total precipitation
        double avgTemp = jacksonville.averageTemp();
        double totalPrecip = jacksonville.totalPrecip();
        
        //input to decide F/C and in/cm - to be completed in 6.02
        while (!tempLabel.equals("F") && !tempLabel.equals("C"))
        {
            System.out.print("Enter F for Fahrenheit or C for Celsius: ");
            tempLabel = in.nextLine();
            tempLabel = tempLabel.toUpperCase();
        }
        while (!precipLabel.equals("in") && !precipLabel.equals("cm"))
        {
            System.out.print("Enter in for inches or cm for centimeters: ");
            precipLabel = in.nextLine();
            precipLabel = precipLabel.toLowerCase();
        }

        //conditions & method call to convert temp, if needed - to be completed in 6.02
        if (tempLabel.equals("C"))
        {
            for (int i = 0; i < temperature.length; i++)
            {
                temperature[i] = jacksonville.tempInCelsius(i);
            }
        }

        //conditions & method call to convert prec, if needed - to be completed in 6.02
        if (precipLabel.equals("cm"))
        {
            for (int i = 0; i < precipitation.length; i++)
            {
                precipitation[i] = jacksonville.precipInCentimeters(i);
            }
        }
        
        //method call to calculate the average temperature
        avgTemp = jacksonville.averageTemp();
        //method call to calculate the total precipitation
        totalPrecip = jacksonville.totalPrecip();
        //method call to print results (hint: Need parameters for month, temperature, precipitation arrays, data labels and the average temperature, total precipitation variables)
        printResults(city, state, month, temperature, precipitation, tempLabel, precipLabel, avgTemp, totalPrecip);

        in.close();
    }//end main
}//end class

