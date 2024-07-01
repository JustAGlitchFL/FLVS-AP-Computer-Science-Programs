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
        
        System.out.print("Enter the letter corresponding to your activity level: ");
        char activity = in.nextLine().charAt(0);

        double afactor = 0.0;

        if activity == 'A' || activity == 'a') {
            afactor = 1.2;
        } else if (activity == 'B' || activity == 'b') {
            afactor = 1.3;
        } else if (activity == 'C' || activity == 'c') {
            afactor = 1.4;
        } else if (activity == 'D' || activity == 'd') {
            afactor = 1.5;
        } else if (activity == 'E' || activity == 'e') {
            afactor = 1.6;
        } else if (activity == 'F' || activity == 'f') {
            afactor = 1.7;
        } else {
            System.out.println("Invalid activity level");
        }

        double tdee = bmr * afactor;
        // Nearest 10th
        double tdee = (int)((tdee * 10) + 0.5) / 10.0;

        // Printing
        System.out.println("\nYour results:");
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex)
        System.out.println("BMR: " + bmr + " calories");
        System.out.println("Activity Factor: " + afactor);
        System.out.println("TDEE: " + tdee + " calories");
    }