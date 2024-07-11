/*
 * This is the program for my DBA
 * @Author: Aidan Procopio
 * @Version: 7/11/2024
 */

import java.util.Scanner;
public class dba {
    public static void printTicket (String name, String id, double price) {
        System.out.println("Welcome to the APCS Carnival, " + name + "!");
        System.out.println("Your user ID is " + id + ".");
        System.out.println("The cost of your ticket is $" + price + ".");
        System.out.println("Have a great time at the APCS Carnival today!");
    }
    public static void main(String[] args) {
        boolean firstResponder = false;
        boolean veteran = false;
        int price = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name (First Last): ");
        String name = in.nextLine();
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        in.nextLine();
        System.out.print("Are you a first responder? (y/n): ");
        if (in.nextLine().equalsIgnoreCase("y")){
            firstResponder = true;
        }else{
            firstResponder = false;
        }

        System.out.print("Are you a veteran? (y/n): ");
        if (in.nextLine().equalsIgnoreCase("y")){
            veteran = true;
        }else{
            veteran = false;
        }

        if (age < 3){
            price = 2;
        }else if (age >= 3 && age <= 5){
            price = 9;
        }else if (age >= 6 && age <= 18){
            price = 11;
        }else if (age > 18){
            price = 12;
        }

        if (((firstResponder == true) || (veteran == true)) && (age > 18)){
            price*=0.5;
        }
        String userID = name.substring(0,1) + name.substring(name.indexOf(" ")+1) + (int) (Math.random() * 1000);

        printTicket(name, userID, price);
    }
}
