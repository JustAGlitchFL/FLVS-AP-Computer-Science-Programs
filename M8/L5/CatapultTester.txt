package M8.L5;
/**
 * purpose: demo 2d array
 * @author Aidan Procopio
 * @version 11/11/2024
 */
public class CatapultTester {
    private static void printResults(double[][] results, int[] speedArray, int[] angleArray) {
        //header
        System.out.println("Projectile Distance (m)");
        System.out.print("m/s"); //using SI units
        for (int angle : angleArray) {
            System.out.print("\t" + angle + "°");
        }
        int separatorLength = 3 + (angleArray.length * 8); // entirely unnecessary, but making it adaptable
        System.out.println();
        for (int i = 0; i < separatorLength; i++) {
            System.out.print("=");
        }
        System.out.println();
        //body
        for (int i = 0; i < speedArray.length; i++) {
            System.out.print(speedArray[i]);
            for (int j = 0; j < angleArray.length; j++) {
                System.out.printf("\t%.2f", results[i][j]); //printf for rounding
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Catapult c = new Catapult();
        int[] speedArray = {20, 25, 30, 35, 40, 45, 50};
        int [] angleArray = {25, 30, 35, 40, 45, 50};
        double[][] results = new double[speedArray.length][angleArray.length];
        for (int i = 0; i < speedArray.length; i++) {
            for (int j = 0; j < angleArray.length; j++) {
                results[i][j] = c.calcDistance(speedArray[i], angleArray[j]);
            }
        }
        printResults(results, speedArray, angleArray);
    }
}
