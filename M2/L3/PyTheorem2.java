/*
* This program calculates the hypotenuse of two right triangles using the Pythagorean Theorem.
* @author Aidan Procopio
* @version 6/24/24
*/

public class PyTheorem2 {

    public static void main(String[] args) {
        int floor = 5;
        int ceiling = 22;
        int a = (int) ((ceiling - floor) * Math.random() + floor);
        int b = (int) ((ceiling - floor) * Math.random() + floor);

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("Triangle 1      Side 1: " + a + "      Side 2: " + b + "      Hypotenuse: " + c);

        a = (int) ((ceiling - floor) * Math.random() + floor);
        b = (int) ((ceiling - floor) * Math.random() + floor);

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("Triangle 2      Side 1: " + a + "      Side 2: " + b + "      Hypotenuse: " + c);
    }
}

