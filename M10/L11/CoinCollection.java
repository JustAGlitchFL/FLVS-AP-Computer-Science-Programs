package M10.L11;
/**
 * Purpose: Coin Collection Class
 * @author Aidan Procopio
 * @version 12/18/2024
 */
import java.util.*;
public class CoinCollection{
    private ArrayList<Coin> coins; //collection of coins
    //precondition: parallel arrays of all the same length
    //write the constructor of CoinCollection for part A
    public CoinCollection(int[] years, double[] values, String[] countries)
    {
        coins = new ArrayList<Coin>();
        for(int i = 0; i < years.length; i++) {
            coins.add(new Coin(years[i], values[i], countries[i]));
        }
    }
    //there may be other constructors and methods not shown
    public boolean isRare(int year)
    {
        for(Coin c : coins) {
            if(c.getYear() >= year)
            {
                return false;
            }
        }
        return true;
    }
}