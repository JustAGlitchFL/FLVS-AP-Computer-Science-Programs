package M9.L8;

import java.util.*;
public class CryptoTesting2 {
    public static void main(String[] args) {
        System.out.println("Testing the CAT toolbox");
        System.out.println("Enter a start value for prime generation: ");
        int start = Integer.parseInt(System.console().readLine()); // found this the other day; saves from having to make a scanner object
        System.out.println("Enter an end value: ");
        int end = Integer.parseInt(System.console().readLine());
        CAT cat = new CAT(start, end);
        System.out.println("Generating primes from " + start + " to " + end);
        System.out.println(cat.generatePrimes());


        // rewritten to be compatible with older versions of Java
        // Scanner in = new Scanner(System.in);
        // System.out.println("Testing the CAT toolbox");
        // System.out.println("Enter a start value for prime generation: ");
        // int start = Integer.parseInt(in.nextLine()); // found this the other day; saves from having to make a scanner object
        // System.out.println("Enter an end value: ");
        // int end = Integer.parseInt(in.nextLine());
        // CAT cat = new CAT(start, end);
        // System.out.println("Generating primes from " + start + " to " + end);
        // System.out.println(cat.generatePrimes());
        // in.close();


    }
}
