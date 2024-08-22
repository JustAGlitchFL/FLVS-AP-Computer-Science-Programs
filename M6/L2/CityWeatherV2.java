
package M6.L2;
/**
 * Annual Weather object class
 * 
 * @author APCS Team
 * @version Today
 */

public class CityWeatherV2 {
    // private instance variables - three arrays
    private String [] months = new String[12];
    private double [] temp = new double[12];
    private double [] precip = new double[12];
    // constructor with parameters
    public CityWeatherV2(String [] months, double [] temp, double [] precip)
    {
        this.months = months;
        this.temp = temp;
        this.precip = precip;
    }
    // setters and getters for each private instance variable
    public void setMonths(String [] months)
    {
        this.months = months;
    }
    public String [] getMonths()
    {
        return months;
    }
    public void setTemp(double [] temp)
    {
        this.temp = temp;
    }
    public double [] getTemp()
    {
        return temp;
    }
    public void setPrecip(double [] precip)
    {
        this.precip = precip;
    }
    public double [] getPrecip()
    {
        return precip;
    }
    // method to calculate the average of temperature
    public double averageTemp()
    {
        double sum = 0;
        for(int i = 0; i < temp.length; i++)
        {
            sum += temp[i];
        }
        return sum / temp.length;
    }
    // method to calculate total precipitation array
    public double totalPrecip()
    {
        double sum = 0;
        for(int i = 0; i < precip.length; i++)
        {
            sum += precip[i];
        }
        return sum;
    }
    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    
    public double tempInCelsius(int index)
    {
        return (temp[index] - 32) * (5.0 / 9.0);
    }
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02
    public double precipInCentimeters(int index)
    {
        return precip[index] * 2.54;
    }


}
