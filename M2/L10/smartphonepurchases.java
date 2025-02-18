/**
This program demonstrates a simple sales system, inputting data and returning a receipt to the user

@author Aidan Procopio 
@version 06/26/24

 */
import java.util.Scanner;

public class smartphonepurchases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your first and last name: ");
        String firstname = in.next();
        String lastname = in.nextLine();
        Character firstinitial = firstname.charAt(0);

        System.out.print("\nPlease enter today's date in MM/DD/YYYY format: ");
        String date = in.nextLine();
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        int year = Integer.parseInt(date.substring(6, 10));

        System.out.print("\nPlease enter the model of the smartphone you would like to purchase: ");
        String model = in.nextLine();

        System.out.print("\nHow many gigabytes of storage would you like? (128, 256, 512, 1024): ");
        int storage = Integer.parseInt(in.next());

        System.out.print("\nPlease enter the price of the smartphone: $");
        double price = Double.parseDouble(in.next());

        System.out.print("\nHow many phones would you like to purchase? ");
        int quant = Integer.parseInt(in.next());

        in.nextLine();
        System.out.print("\nEnter your credit card number (#### #### #### ####): ");
        String cardnumber = in.nextLine();
        int last4 = Integer.parseInt(cardnumber.substring(15, 19));

        System.out.print("\nEnter your PIN (####): ");
        int pin = Integer.parseInt(in.next());
        
        //receipt
        System.out.println("\n=====================================");

        System.out.println("\nThank you for your purchase, " + firstinitial + "." + lastname + "!");
        System.out.println("Date: " + month + "-" + day + "-" + year);
        System.out.println("Order number: " + last4 + (Math.random() * 1000));
        System.out.println("Card ending in: " + last4);

        System.out.println("\nModel: " + model);
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quant);
        System.out.println("Total: $" + price * quant);

        System.out.println("\nThank you for your purchase! Have a great day!");

        System.out.println("\n=====================================");



    }
}