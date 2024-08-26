package M6.L4;

import java.util.Arrays;

/**
 * purpose: Student Object Class
 * @author Aidan Procopio
 * @version 8/25/2024
 */
public class Studentrev2 {
    private String name;
    private int[] quizScores;
    private double average;
    private int difference;

    public Studentrev2(String name, int[] quizScores) {
        this.name = name;
        this.quizScores = quizScores;
        this.average = 0.0;
    }

    public String getName() {
        return name;
    }
    public int[] getQuizScores() {
        return quizScores;
    }
    public double getAverage() {
        return average;
    }
    public int getDifference() {
        return difference;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setQuizScores(int[] quizScores) {
        this.quizScores = quizScores;
    }
    public void addQuiz (int score) {
        int[] tempScores = new int[quizScores.length + 1];
        for (int i = 0; i < quizScores.length; i++) {
            tempScores[i] = quizScores[i];
        }
        tempScores[quizScores.length] = score;
        quizScores = tempScores;
    }
    public void refreshAverage() {
        double sum = 0.0;
        for (int i = 0; i < quizScores.length; i++) {
            sum += quizScores[i];
        }
        average = sum / quizScores.length;
    }
    public void refreshDifference() { //only supports 2 quizzes at this time
        difference = quizScores[1] - quizScores[0];
    }
    public String toString() {
        return "Name: " + name + "\nQuiz Scores: " + Arrays.toString(quizScores) + "\nDifference: " + difference + "\nAverage: " + average;
    }
}
