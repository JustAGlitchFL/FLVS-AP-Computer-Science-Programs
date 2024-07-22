package M5.L2;
/**
 * Calculates the gravitational acceleration on the surface of a planet.
 * 
 * @author Aidan Procopio
 * @version 07/22/2024
 */
public class PlanetGravity {
    public static void printheader() {
        System.out.println("\t\t\t\tPlanetary Data");
        System.out.println("\tPlanet\t\tDiameter (km)\t\tMass (kg)\t\tg (m/s^2)");
        System.out.println("---------------------------------------------------------------------------------------");
    }

    public static double calculateGravity(double masskg, double diameterkm) {
        double g = 0.0;
        double G = 6.67 * Math.pow(10, -11);
        double radius = diameterkm / 2 * 1000;
        g = G * masskg / Math.pow(radius, 2);
        return g;
    }

    public static void printdata(String planetname, double diameterkm, double masskg, double g) {
        System.out.println("\t" + planetname + "\t\t" + diameterkm + "\t\t\t" + masskg + "\t" + g);
    }
    public static void main(String[] args) {
        String planetname = "Mars";
        double masskg = 6.4219 * Math.pow(10, 23);
        double diameterkm = 6974;
        double g = 0.0;

        printheader();
        g = calculateGravity(masskg, diameterkm);
        printdata(planetname, diameterkm, masskg, g);

    }
}