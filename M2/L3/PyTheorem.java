/*
* This program calculates the hypotenuse of two right triangles using the Pythagorean Theorem.
* @author Aidan Procopio
* @version 6/23/24
*/

public class PyTheorem {

    public static void main(String[] args) {
        double floor = 5;
        double ceiling = 23;
        double a = (ceiling - floor) * Math.random() + floor;
        double b = (ceiling - floor) * Math.random() + floor;

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("Triangle 1      Side 1: " + a + "      Side 2: " + b + "      Hypotenuse: " + c);

        a = (ceiling - floor) * Math.random() + floor;
        b = (ceiling - floor) * Math.random() + floor;

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("Triangle 2      Side 1: " + a + "      Side 2: " + b + "      Hypotenuse: " + c);
    }
}

