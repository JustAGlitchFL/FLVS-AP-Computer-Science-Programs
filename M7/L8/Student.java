package M7.L8;
/**
 * Purpose:  Define Student Object
 *
 * @author Aidan Procopio
 * @version 10/15/2024
 */
public class Student {
    String name; int[] grades = new int[5];
    public Student(String name, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5){
        this.name = name;
        grades[0] = quiz1;
        grades[1] = quiz2;
        grades[2] = quiz3;
        grades[3] = quiz4;
        grades[4] = quiz5;
    }

    public void setQuiz(int quizNum, int grade){
        grades[quizNum - 1] = grade;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return String.format("%-14s%-8d%-8d%-8d%-8d%-8d", name+":", grades[0], grades[1], grades[2], grades[3], grades[4]); //change later for table
    }
}