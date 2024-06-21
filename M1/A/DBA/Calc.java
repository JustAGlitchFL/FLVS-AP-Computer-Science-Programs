package M1.A.DBA;

public class Calc {
    public static void main(String[] args) {
        int value = 7;
        int value2 = 2;

        System.out.println("The original value is " + value+".");

        int div = value / value2;

        System.out.println("When " + value + " is divided by 2, the whole number result is " + div + ".");

        int mod = value % value2;

        System.out.println("The remainder of " + value + " divided by 2 is " + mod + ".");

        double div2 = (double) value / value2;

        System.out.println("When " + value + " is divided by 2, the decimal result is " + div2 + ".");

    }
}
