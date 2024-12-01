package M9.L3;
/**
 * This class demonstrates the circles
 * @author Aidan Procopio
 * @version 11/28/24
 */
import java.util.ArrayList;
public class CirclesClient {
    private static void showCenter(Circle2 c) {
        System.out.println("For this " + c.getName() + " the " + c.getCenter() + ".");
    }
    public static void main(String[] args) {
        ArrayList<Circle2> circles = new ArrayList<Circle2>();
        circles.add(new Circle2(2, 4, 6));
        circles.add(new Cylinder2(10, 15, 7, 8));
        circles.add(new Oval2(25, 10, 8, 10));
        circles.add(new OvalCylinder2(40, 10, 9, 11, 12));
        for (Circle2 c : circles) {
            showCenter(c);
        }
    }
}
