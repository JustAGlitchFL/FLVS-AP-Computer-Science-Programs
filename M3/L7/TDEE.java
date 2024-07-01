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
        char sex = in.nextLine().charAt(0);

        System.out.println("\nSelect Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Restricted Mobility)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
        
        System.out.print("\nEnter the letter corresponding to your activity level: ");
        String activity = in.nextLine().substring(0, 1);

        double afactor = 0.0;

        if (activity.equals("A") || activity.equals("a")) {
            if (sex == 'M' || sex == 'm') {
                afactor = 1.0;
            }else if (sex == 'F' || sex == 'f'){
                afactor = 1.0;
            }
        } else if (activity.equals("B") || activity.equals("b")) {
            if (sex == 'M' || sex == 'm') {
                afactor = 1.3;
            }else if (sex == 'F' || sex == 'f'){
                afactor = 1.3;
            }
        } else if (activity.equals("C") || activity.equals("c")) {
            if (sex == 'M' || sex == 'm') {
                afactor = 1.6;
            }else if (sex == 'F' || sex == 'f'){
                afactor = 1.5;
            }
        } else if (activity.equals("D") || activity.equals("d")) {
            if (sex == 'M' || sex == 'm') {
                afactor = 1.7;
            }else if (sex == 'F' || sex == 'f'){
                afactor = 1.6;
            }
        } else if (activity.equals("E") || activity.equals("e")) {
            if (sex == 'M' || sex == 'm') {
                afactor = 2.1;
            }else if (sex == 'F' || sex == 'f'){
                afactor = 1.9;
            }
        } else if (activity.equals("F") || activity.equals("f")) {
            if (sex == 'M' || sex == 'm') {
                afactor = 2.4;
            }else if (sex == 'F' || sex == 'f'){
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