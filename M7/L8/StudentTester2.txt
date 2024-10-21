package M7.L8;
/**
 * Purpose:  Utilize student object
 *
 * @author Aidan Procopio
 * @version 10/15/2024
 */
import java.util.ArrayList;
import java.util.Arrays;
public class StudentTester {
    private static void refreshGradeBook(ArrayList<Student> students){
        System.out.println("Gradebook:");
        System.out.printf("%-14s%-8s%-8s%-8s%-8s%-8s\n", "Name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("-------------------------------------------------");
        for(Student student : students){
            System.out.println(student);
        }
    }
    private static void replaceGrade(ArrayList<Student> students, String target, int quizNum, int grade){
        for(Student student : students){
            if(student.getName().equals(target)){
                student.setQuiz(quizNum, grade);
            }
        }
    }

    private static void replaceStudent(ArrayList<Student> students, String target, String newName, ArrayList<Integer> newGrades){
        for(Student student : students){
            if(student.getName().equals(target)){
                student.setName(newName);
                for(int i = 0; i < newGrades.size(); i++){
                    student.setQuiz(i + 1, newGrades.get(i));
                }
            }
        }
    }

    private static void insertBeforeTarget(ArrayList<Student> students, String target, String newName, ArrayList<Integer> newGrades){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getName().equals(target)){
                students.add(i, new Student(newName, newGrades.get(0), newGrades.get(1), newGrades.get(2), newGrades.get(3), newGrades.get(4)));
                return;
            }
        }
    }

    private static void deleteTarget(ArrayList<Student> students, String target){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getName().equals(target)){
                students.remove(i);
                return;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Ryan", 92, 87, 100, 95, 88));
        students.add(new Student("Skylar", 100, 100, 100, 100, 100));
        students.add(new Student("Chase", 85, 90, 95, 68, 100));
        students.add(new Student("Jason", 89, 92, 95, 98, 100));
        students.add(new Student("Patrick", 98, 95, 93, 87, 99));

        System.out.println("Initial Gradebook:");
        refreshGradeBook(students);
        System.out.println();

        System.out.println("Chase, after 3 months, has finally done corrections on quiz 4.");
        replaceGrade(students, "Chase", 4, 84);
        refreshGradeBook(students);
        System.out.println();

        System.out.println("Jason has been removed from the class and replaced with Khaled");
        replaceStudent(students, "Jason", "Khaled", new ArrayList<Integer>(Arrays.asList(94, 83, 99, 100, 91))); // testing a new method for inputting an arraylist directly into the function call
        refreshGradeBook(students);
        System.out.println();

        System.out.println("Inserting Victoria before Skylar");
        insertBeforeTarget(students, "Skylar", "Victoria", new ArrayList<Integer>(Arrays.asList(93, 88, 100, 90, 95)));
        refreshGradeBook(students);
        System.out.println();

        System.out.println("Removing Ryan from the class");
        deleteTarget(students, "Ryan");
        refreshGradeBook(students);
    }
}
