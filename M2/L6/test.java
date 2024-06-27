import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        double heightIn = 67.34;
        double heightCm = 2.54 / heightIn;
        double weightLb = 150.0;
        double weightKg = 0.453592 * weightLb;
        int age = 25;
        double s = 5.0;

        if(true) {
            double bMR = (10.0 * weightKg) + (6.25 * heightCm) - (5.0 * age) + s;
        }
    }
}