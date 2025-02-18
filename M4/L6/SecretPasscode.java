package M4.L6;
/**
 * Randomly generate passwords.
 *
 * @author Aidan Procopio
 * @version 07/19/2024
 * 
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class SecretPasscode
{
        public static void main(String [] args) throws IOException
        {
                String userChoice = "Y";
                int pwLength = 0;
                int randNum = 0; 
                String password = "";

                // initialize scanner and print writer
                Scanner in = new Scanner(System.in);
                PrintWriter outFile = new PrintWriter(new File("./M4/L6/passwords.txt")); // pathname needs folder as it runs out of project root using VSCode compiler.
                // PrintWriter outFile = new PrintWriter(new File("passwords.txt")); // Use this line if running file from its own directory.
                System.out.println("**********************************************************");
                System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");
                
                // the user wants to continue
                System.out.println("Press enter to start.");
                in.nextLine();
                while (userChoice.equalsIgnoreCase("Y")) {
                        while (pwLength < 6) {        
                                // ask for password length 
                                System.out.print("Enter the length of the password (at least 6): ");
                                pwLength = in.nextInt();
                                if (pwLength < 6) {
                                System.out.println("Password length must be at least 6 characters.");
                                }
                                in.nextLine();
                        }
                                
                        // generate a random character in the correct character set
                        while (password.length() < pwLength) {
                                randNum = (int)(Math.random() * 3);
                                if (randNum == 0) {
                                        password += (char)(Math.random() * 26 + 65); // uppercase
                                } else if (randNum == 1) {
                                        password += (char)(Math.random() * 26 + 97); // lowercase
                                } else {
                                        password += (char)(Math.random() * 10 + 48); // numbers
                                }
                                
                        }

                        // write the password to the file
                        outFile.println(password);
                        // clear the password
                        password = "";
                        // ask the user if they want to continue
                        System.out.print("Do you want to generate another password? (Y/N): ");
                        userChoice = in.nextLine();
                        pwLength = 0;
                }
                // when the user is done, close the text file so that it can be re-opened and read
                outFile.close();

                // read passwords back from text file and display to the screen

                Scanner inFile = new Scanner(new File("./M4/L6/passwords.txt")); // pathname needs folder as it runs out of project root using VSCode compiler.
                // Scanner inFile = new Scanner(new File("passwords.txt")); // Use this line if running file from its own directory.
                System.out.println("Here are the passwords you generated:");
                while (inFile.hasNext()) {
                        System.out.println("1. " + inFile.nextLine());
                }
                inFile.close();
        }//end main
}//end class

