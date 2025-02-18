package M10.L5;
/**
 * Purpose: This class is used to test the Fibonacci class.
 * @author Aidan Procopio
 * @version 12/15/2024
 */
import java.util.*;
public class FibonacciTester {
    public static void main(String[] args) {
        System.out.println("Fibonacci Calculator");
        
        Scanner in = new Scanner(System.in);
        int n;
        String response;
        while (true) {
            System.out.print("Enter a value to calculate the Fibonacci number (Between 0 and 48): "); // This takes a bit, but I have a decent amount of compute in my machine. However, 49 will cause it to flip negatve, not exactly sure why. There's also probably an allocation limit somewhere, as even watching single core utilization this doesn't move the graph much.
            while (true) {
                if (in.hasNextInt()) {n = in.nextInt();if (n >= 0 && n <= 48) {break;} else {System.out.print("Please enter a positive integer between 0 an 48: ");}
                } else {System.out.print("Please enter a valid integer: ");in.next();}
            }
            System.out.println("The Fibonacci number for " + n + " is " + Fibonacci.calcFibonacci(n));
            System.out.print("Would you like to calculate another number? (y/n): ");
            in.nextLine();
            response = in.nextLine();
            if (response.toUpperCase().equals("N")) {break;}

        }

    }
}
