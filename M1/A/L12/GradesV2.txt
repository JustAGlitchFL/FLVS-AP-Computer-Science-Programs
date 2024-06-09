/**
The purpose of this program is to calculate points and average grades for test scores
 * 
 * @author Aidan Procopio
 * @version 06/08/2024
 */

 package M1.A.L12;
 public class GradesV2
 {
     public static void main(String[ ] args)
     {
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade
        
        numTests++;
        testGrade = 95;
        totalPoints+=testGrade;
        average= (double) totalPoints/ (double) numTests;
        System.out.println("Test #1\tTest Grade: "+testGrade+"\tTotal Points: "+totalPoints+"\tAverage Score: "+average);

        numTests++;
        testGrade = 73;
        totalPoints+=testGrade;
        average=(double) totalPoints/ (double) numTests;
        System.out.println("Test #1\tTest Grade: "+testGrade+"\tTotal Points: "+totalPoints+"\tAverage Score: "+average);

        numTests++;
        testGrade = 91;
        totalPoints+=testGrade;
        average=(double) totalPoints/ (double) numTests;
        System.out.println("Test #1\tTest Grade: "+testGrade+"\tTotal Points: "+totalPoints+"\tAverage Score: "+average);        
        
        numTests++;
        testGrade = 82;
        totalPoints+=testGrade;
        average=(double) totalPoints/ (double) numTests;
        System.out.println("Test #1\tTest Grade: "+testGrade+"\tTotal Points: "+totalPoints+"\tAverage Score: "+average);

        numTests++;
        testGrade = 99;
        totalPoints+=testGrade;
        average=(double) totalPoints/ (double) numTests;
        System.out.println("Test #1\tTest Grade: "+testGrade+"\tTotal Points: "+totalPoints+"\tAverage Score: "+average);

        numTests++;
        testGrade = 100;
        totalPoints+=testGrade;
        average=(double) totalPoints/ (double) numTests;
        System.out.println("Test #1\tTest Grade: "+testGrade+"\tTotal Points: "+totalPoints+"\tAverage Score: "+average);

        numTests++;
        testGrade = 93;
        totalPoints+=testGrade;
        average=(double) totalPoints/ (double) numTests;
        System.out.println("Test #1\tTest Grade: "+testGrade+"\tTotal Points: "+totalPoints+"\tAverage Score: "+average);

        numTests++;
        testGrade = 65;
        totalPoints+=testGrade;
        average=(double) totalPoints/ (double) numTests;
        System.out.println("Test #1\tTest Grade: "+testGrade+"\tTotal Points: "+totalPoints+"\tAverage Score: "+average);

        numTests++;
        testGrade = 87;
        totalPoints+=testGrade;
        average=(double) totalPoints/ (double) numTests;
        System.out.println("Test #1\tTest Grade: "+testGrade+"\tTotal Points: "+totalPoints+"\tAverage Score: "+average);
     }//end of main method
 }//end of class