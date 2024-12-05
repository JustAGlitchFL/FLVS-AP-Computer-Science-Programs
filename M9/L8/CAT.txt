package M9.L8;
import java.math.BigInteger;
/**
 *  Cryptography Analysis Tool
 *  Provides methods to assist in breaking weak encryption
 */
import java.util.*;
public class CAT {
    // would be easier to just pass the start and end as parameters to the methods that need them, but the assignment requires an object to be created
    private int start;
    private int end;

    public CAT(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // used to crack weak/short public keys, will quickly bog down with large numbers (also must be a product of two primes)
    public static int[] factorPubKey(int pubKey) {
        int[] factors = new int[2];
        for (int i = 2; i < pubKey; i++) {
            if (pubKey % i == 0) {
                factors[0] = i;
                factors[1] = pubKey / i;
                break;
            }
        }
        return factors;
    }

    // generates the list of primes from the assignment with a given range
    public ArrayList<Integer> generatePrimes() {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    // checks if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // returns a psuedorandom prime of a given length
    public static int generateRandomPrime(int length) {
        BigInteger prime = BigInteger.probablePrime(length * 3, new java.util.Random());
        while (prime.toString().length() != length) {
            prime = BigInteger.probablePrime(length * 3, new java.util.Random());
        }
        return prime.intValue();
    }
}
