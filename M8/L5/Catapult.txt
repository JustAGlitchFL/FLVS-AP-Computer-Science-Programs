package M8.L5;
/**
 * purpose: demo 2d array
 * @author Aidan Procopio
 * @version 11/11/2024
 */
public class Catapult {
    //constructor
    public Catapult(){}

    public double calcDistance(double speed, double angle) {
        double distance = (Math.pow(speed, 2) * Math.sin(2 * Math.toRadians(angle))) / 9.8;
        return distance;
    }
}
