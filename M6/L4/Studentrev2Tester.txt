package M6.L4;
/**
 * @purpose: Studentrev2 Tester Class
 * @author Aidan Procopio
 * @version 8/25/2024
 */
public class Studentrev2Tester {
    public static void main(String[] args) {
        String name1 = "Aidan";
        int[] quizScores1 = {100, 94};

        String name2 = "Skylar";
        int[] quizScores2 = {100, 100};

        String name3 = "Jason";
        int[] quizScores3 = {72, 86};

        String name4 = "Chase";
        int[] quizScores4 = {92};

        String name5 = "Patrick";
        int[] quizScores5 = {95, 100};

        Studentrev2[] studentrev2s = {new Studentrev2(name1, quizScores1), new Studentrev2(name2, quizScores2), new Studentrev2(name3, quizScores3), new Studentrev2(name4, quizScores4), new Studentrev2(name5, quizScores5)};
        
        studentrev2s[3].addQuiz(87);

        for (Studentrev2 i : studentrev2s) {// refreshes the average and difference for each studentrev2
            i.refreshAverage();
            i.refreshDifference();
        }

        System.out.println("Quiz Analytics");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %n", "Name", "Quiz 1", "Quiz 2","Difference", "Average");
        System.out.println("===================================================");
        for (Studentrev2 i : studentrev2s) {
            System.out.printf("%-10s %-10d %-10d %-+10d %-10.2f %n", i.getName(), i.getQuizScores()[0], i.getQuizScores()[1], i.getDifference(), i.getAverage());
        }
    }
}
