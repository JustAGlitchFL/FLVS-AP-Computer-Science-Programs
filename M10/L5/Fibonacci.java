package M10.L5;
/**
 * Purpose: This class is used to calculate the Fibonacci number.
 * @author Aidan Procopio
 * @version 12/15/2024
 */
public class Fibonacci {
    public Fibonacci() {
    }     
    public static int calcFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calcFibonacci(n - 1) + calcFibonacci(n - 2);
        }
    }
}
