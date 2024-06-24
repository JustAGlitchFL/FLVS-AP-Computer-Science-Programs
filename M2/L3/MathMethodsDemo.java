
/**
 * This class demonstrates the use of several members of the Math class.
 *
 *     NOTE: There are multiple segments of code below. After you understand
 *           the code in one section, delete block comment symbols (slash
 *           and asterisk) in order to continue discovering.
 *
 * @author Aidan Procopio
 * @version 06/23/24
 */
public class MathMethodsDemo
{
    public static void main(String[ ] args)
    {
        //example of raising a number to the nth power
        double number = 54.8;
        double nthPower = 2.3;
        double powValue = Math.pow(number, nthPower);
        System.out.println(number + " to the power of " + nthPower + ": " + powValue);
        System.out.println();

        // example of integers and the pow() method
        int n = 8;
        int p = 34;
        int powValue2 = (int)Math.pow(n, p);
        System.out.println(n + " to the power of " + p + ": " + powValue2);
        System.out.println();
        

        //example of finding the square root of a value
        double someNumber = 17.5;
        double squareRoot = Math.sqrt(someNumber);
        System.out.println("The square root of " + someNumber + " is: " + squareRoot);
        System.out.println();

        double someNumber2 = 25;
        double squareRoot2 = Math.sqrt(someNumber2);
        System.out.println("The square root of " + someNumber2 + " is: " + squareRoot2);
        System.out.println();

        double someNumber3 = 2;
        double squareRoot3 = Math.sqrt(someNumber3);
        System.out.println("The square root of " + someNumber3 + " is: " + squareRoot3);
        System.out.println();

        //example of finding the absolute value of an integer
        int integerNumber = -34;
        int intAbsValue = Math.abs(integerNumber);
        System.out.println("The absolute value of " + integerNumber + " is: " + intAbsValue);
        System.out.println();

        //example of finding the absolute value of a double
        
        double decimalNumber = -4.56;
        double decimalAbsValue = Math.abs(decimalNumber);
        System.out.println("The absolute value of " + decimalNumber + " is: " + decimalAbsValue);
        System.out.println();

        decimalNumber = -56;
        decimalAbsValue = Math.abs(decimalNumber);
        System.out.println("The absolute value of " + decimalNumber + " is: " + decimalAbsValue);
        System.out.println();

        decimalNumber = 8;
        decimalAbsValue = Math.abs(decimalNumber);
        System.out.println("The absolute value of " + decimalNumber + " is: " + decimalAbsValue);
        System.out.println();


        //example of using the constant PI to calculate a circumference
        //notice that PI is not assigned a value, it has a constant value assigned by the Math class
        
		double myRadius = 3.5;
		double myCircumference = 2 * Math.PI * myRadius;
		System.out.println("The circumference of a circle with radius " + myRadius + " is: " + myCircumference);
        System.out.println();

        double R = 3.5;
		double A = 2 * Math.PI * Math.pow(R, 2);
		System.out.println("The area of a cicle with radius " + R + " is: " + A);
        System.out.println();
        
        R = 20;
		A = 2 * Math.PI * Math.pow(R, 2);
		System.out.println("The area of a cicle with radius " + R + " is: " + A);
        System.out.println();


        //There is no segment with random here to uncomment, so I have added my own.
        double floor = 1.0;
        double ceiling = 10.0;
        double randomcoefficent = Math.random();
        double random = (ceiling - floor) * randomcoefficent + floor;
        System.out.println("A random number between " + floor + " and " + ceiling + " is: " + random);


        //example of multiple Math class methods used together
        /*
        int x1 = 300;
        int x2 = 250;
        double answer = Math.sqrt(Math.pow(Math.abs(x2 - x1),3));
        System.out.println("The result of Math.sqrt(Math.pow(Math.abs(x2 - x1),3)) is: " + answer);
        System.out.println();
        */
    }//end of main method
}//end of class
