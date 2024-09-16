package M6.L7;

public class q1 {
    public int productOfPrimes() {
        int [] fivePrimes = new int[5];
        fivePrimes[0] = 2;
        fivePrimes[1] = 3;
        fivePrimes[2] = 5;
        fivePrimes[3] = 7;
        fivePrimes[4] = 11;

        int product = 1;
        for (int i : fivePrimes) {
            product *= i;
        }
        return product;
    }
    public static void main(String[] args) {
        int [] fivePrimes = new int[5];
        fivePrimes[0] = 2;
        fivePrimes[1] = 3;
        fivePrimes[2] = 5;
        fivePrimes[3] = 7;
        fivePrimes[4] = 11;

        int product = 1;
        for (int i : fivePrimes) {
            product *= i;
        }
    }
}
