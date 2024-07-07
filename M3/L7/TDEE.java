/*
 * Description: This program calculates the Total Daily Energy Expenditure (TDEE) of a person based on their Basal Metabolic Rate (BMR) and activity level.
 * @author Aidan Procopio
 * @version 7/7/2024
 */

import java.util.Scanner;
public class TDEE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first and last name: ");
        String name = in.nextLine();
        System.out.print("Please enter your BMR: ");
        int bmr = in.nextInt();
        in.nextLine();
        System.out.print("Please enter your sex (M/F): "); 
        String sex = in.nextLine().substring(0,1);

        System.out.println("\nSelect Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Restricted Mobility)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
        
        System.out.print("\nEnter the letter corresponding to your activity level: ");
        String activity = in.nextLine().substring(0,1);

        double afactor = 0.0;

        if (activity.equalsIgnoreCase("A")) {
            afactor = 1.0;
        } else if (activity.equalsIgnoreCase("B")) {
            afactor = 1.3;
        } else if (activity.equalsIgnoreCase("C")) {
            if (sex.equalsIgnoreCase("M")) {
                afactor = 1.6;
            } else {
                afactor = 1.5;
            }
        } else if (activity.equalsIgnoreCase("D")) {
            if (sex.equalsIgnoreCase("M")) {
                afactor = 1.7;
            } else {
                afactor = 1.6;
            }
        } else if (activity.equalsIgnoreCase("E")) {
            if (sex.equalsIgnoreCase("M")) {
                afactor = 2.1;
            } else {
                afactor = 1.9;
            }
        } else if (activity.equalsIgnoreCase("F")) {
            if (sex.equalsIgnoreCase("M")) {
                afactor = 2.4;
            } else {
                afactor = 2.2;
            }
        } else {
            System.out.println("Invalid activity level");
        }

        double tdee = bmr * afactor;
        // Nearest 10th
        tdee = (int)((tdee * 10) + 0.5) / 10.0;

        // Printing
        System.out.println("\nYour results:");
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("BMR: " + bmr + " calories");
        System.out.println("Activity Factor: " + afactor);
        System.out.println("TDEE: " + tdee + " calories");
    }
}