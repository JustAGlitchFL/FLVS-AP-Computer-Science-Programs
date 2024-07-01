package M3.L5;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first and last name: ");
        String name = in.nextLine();
        System.out.print("Enter your weight in pounds: ");
        int weightlb = in.nextInt();
        in.nextLine();
        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        String heighftin = in.nextLine();
        int heightft = Integer.parseInt(heighftin.substring(0, heighftin.indexOf(" ")));
        int heightin = Integer.parseInt(heighftin.substring(heighftin.indexOf(" ") + 1));
        double heightm = (heightft * 12.0 + (double) heightin) * 0.0254;
        double weightkg = weightlb * 0.453592;
        double bmi = weightkg / Math.pow(heightm, 2);
        
        heightm = (int)((heightm * 10) + 0.5) / 10.0;
        weightkg = (int)((weightkg * 10) + 0.5) / 10.0;
        bmi = (int)((bmi * 10) + 0.5) / 10.0;

        System.out.println("\nBody Mass Index Calculator");
        System.out.println("====================================");
        System.out.println("Name: " + name);
        System.out.println("Height (m): " + heightm);
        System.out.println("Weight (kg): " + weightkg);
        System.out.println("BMI: " + bmi);
        System.out.print("Category: ");
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
