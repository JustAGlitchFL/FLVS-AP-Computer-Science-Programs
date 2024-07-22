package M4.L7;
/**
 * 
 * @author Aidan Procopio
 * @version 07/21/2024
 * 
 * This Math trick and many more can be found at: http://www.pleacher.com/handley/puzzles/mtricks.html
 *
 */

 public class MathTrick {
	
	/**
	 * 
	 ******  DO NOT USE ARRAYS AT ALL,  AND DO NOT CONVERT NUMBERS TO STRING UNTIL STEP 7 ******
	 *
	 */
	
	// Step 1) Creates a random 3 digit (100-999) number where the first and last digit differ by more than one
	// Hint: Use Math.random() to create number in the correct range
	// 		 use modulus to find the last digit and divide by 100 for the first digit.
	//		 calculate the difference, which method can you use so it doesn't matter how the numbers are subtract?
	// 		 while the difference of the digits is less than 2, create a new random number and try again

	public static int getRandomNum() 
	{	int num = 0;
		int firstDigit = 0;
		int lastDigit = 0;

		// complete the method		
        while (Math.abs(firstDigit - lastDigit) < 2) {
            num = (int)(Math.random() * 900) + 100;
            firstDigit = num / 100;
            lastDigit = num % 10;
        }
		return num;
	}

	// Step 2 & 4) reverse the digits of a number
	// Hint: to reverse a number without converting it to a String:
	//		create a new variable to store the reversed number
	//		while the original number > 0
	//		for each digit, multiply the new variable by 10 (to make room for the new digit) 
	//		then add the last digit (remember modulus?) to the new variable
	//		divide the original number by 10 to get rid of the last digit
	//	Ex: 584--> (0 x 10) + 4 = 4 ; 58--> (4 x 10) + 8 = 48; 5-->(48 x 10) + 5 = 485

	public static int reverseDigits (int num) {
	
		// complete the method
        int reversednum = 0;
        while (num > 0) {
            reversednum = (reversednum * 10) + (num % 10);
            num /= 10;
        }
        return reversednum;
	}
	
	// Step 7) replace characters in a String according to the chart
	// Hint: Loop through the String and "replace" the numbers with the corresponding letter
	public static String replaceLtr(String str)
	{
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                newstr += 'Y';
            } else if (str.charAt(i) == '1') {
                newstr += 'M';
            } else if (str.charAt(i) == '2') {
                newstr += 'P';
            } else if (str.charAt(i) == '3') {
                newstr += 'L';
            } else if (str.charAt(i) == '4') {
                newstr += 'R';
            } else if (str.charAt(i) == '5') {
                newstr += 'O';
            } else if (str.charAt(i) == '6') {
                newstr += 'F';
            } else if (str.charAt(i) == '7') {
                newstr += 'A';
            } else if (str.charAt(i) == '8') {
                newstr += 'I';
            } else if (str.charAt(i) == '9') {
                newstr += 'B';
            } else {
                newstr += str.charAt(i);
            }
        }
        
		// complete the method	
			return newstr;
	}
	
	// Step 8) reverse the letters in a String
	// Hint: start with an empty String variable 
	//		 loop through the original word   
	//		 add one letter at time to the new variable using concatenation and .substring()
	public static String reverseString(String str) {
		// complete the method
        String reversedstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedstr += str.substring(i, i + 1);
        }
        return reversedstr;
	}
		
	public static void main(String[] args) 
	{
//		1.	Generate a random 3-digit number so that the first and third digits differ by more than one.
		int num1 = getRandomNum();
        System.out.println("1. The starting number: " + num1);
//		2.	Now reverse the digits to form a second number.
        int num2 = reverseDigits(num1);
        System.out.println("2. The reversed number: " + num2);
//		3.	Subtract the smaller number from the larger one.
        int num3 = Math.abs(num1 - num2);
        System.out.println("3. The difference: " + num3);
//		4.	Now reverse the digits in the answer you got in step 3 and add it to that number.
        int num4 = num3 + reverseDigits(num3);
        System.out.println("4. The reversed number added to difference " + num4);
//		5.	Multiply by one million.
        int num5 = num4 * 1000000;
        System.out.println("5. The number multiplied by 1,000,000: " + num5);
//		6.	Subtract 733,361,573.
        int num6 = num5 - 733361573;
        System.out.println("6. The number subtracted by 733,361,573: " + num6);
//		7.	Convert the number to a string in order to replace the numbers with letters.
// 				Ex: String str = String.valueOf(myNumber);
//			Then, replace each of the digits in your answer, with the letter it corresponds to using the table in the instructions.
        String str7a = String.valueOf(num6);
        String str7b = replaceLtr(str7a);
        System.out.println("7. Replaced string: " + str7b);
//		8.	Now reverse the letters in the string to read your message backward.
        String str8 = reverseString(str7b);
        System.out.println("8. Reversed string: " + str8);
	} // end main
} // end class