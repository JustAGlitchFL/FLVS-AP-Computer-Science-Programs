/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Aidan Procopio
 * @version 06/17/2024
 */
package M1.A.L13;
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars

		// Mexico
        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 18.5328;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = pesosSpent/pesoExchangeRate;      // US dollars spent in Mexico
        double dollarsAfterMexico = startingUsDollars-dollarsSpentInMexico;        // US dollars remaining after Mexico

		
		// Germany
		double eurosSpent = 1542;            // Euros spent
		double euroExchangeRate = 0.9314;     // 1 US dollar = 0.92 Euros
		double dollarsSpentInGermany = eurosSpent/euroExchangeRate;      // US dollars spent in Germany
		double dollarsAfterGermany = dollarsAfterMexico-dollarsSpentInGermany;        // US dollars remaining after Germany

		// Japan
		double yenSpent = 73349;            // Yen spent
		double yenExchangeRate = 156.6530;     // 1 US dollar = 156.73 Yen
		double dollarsSpentInJapan = yenSpent/yenExchangeRate;      // US dollars spent in Japan
		double dollarsAfterJapan = dollarsAfterGermany-dollarsSpentInJapan;        // US dollars remaining after Japan


        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here
		
		System.out.println("Starting US dollars:        " + startingUsDollars);
		System.out.println();
		// Mexico
		System.out.println("Mexico:");
		System.out.println("Pesos spent:                " + pesosSpent);
		System.out.println("US dollars equivalent:      " + dollarsSpentInMexico);
		System.out.println("US dollars remaining:       " + dollarsAfterMexico);
		System.out.println();

		// Germany
		System.out.println("Germany:");	
		System.out.println("Euros spent:                " + eurosSpent);
		System.out.println("US dollars equivalent:      " + dollarsSpentInGermany);
		System.out.println("US dollars remaining:       " + dollarsAfterGermany);
		System.out.println();

		// Japan
		System.out.println("Japan:");
		System.out.println("Yen spent:                  " + yenSpent);
		System.out.println("US dollars equivalent:      " + dollarsSpentInJapan);
		System.out.println("US dollars remaining:       " + dollarsAfterJapan);
		System.out.println();

		System.out.println("==================================================");
		System.out.println("Remaining US dollars:       " + (startingUsDollars - dollarsSpentInMexico - dollarsSpentInGermany - dollarsSpentInJapan));
		System.out.println();
		System.out.println();



        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 12;  						//cost per item of first souvenir
		int budget1 = 100;   						//budget for first item
		int totalItems1 = (int) (budget1/costItem1); 		//how many items can be purchased
		int fundsRemaining1 = budget1%costItem1;  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = (int) (budget2/costItem2); 	//how many items can be purchased
		double fundsRemaining2 = budget2%costItem2;  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

