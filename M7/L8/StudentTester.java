/**
 * Purpose:  Utilize student object
 *
 * @author Aidan Procopio
 * @version 10/15/2024
 */

public class StudentTester {
    private static void refreshGradeBook(ArrayList<Student> students){
        System.out.println("Gradebook:");
        for(Student student : students){
            System.out.println(student);
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>;
        students.add(new Student("Ryan", 92, 87, 100, 95, 88));
        students.add(new Student("Skylar", 100, 100, 100, 100, 100));
        students.add(new Student("Chase", 85, 90, 95, 100, 100));
        students.add(new Student("Jason", 89, 92, 95, 98, 100));
        students.add(new Student("Patrick", 98, 95, 93, 87, 99));


    }
}
