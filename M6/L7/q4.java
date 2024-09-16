package M6.L7;

public class q4 {
    public double averageTime() {
        double[ ] time = {24.6, 23.8, 27.4, 25.9, 26.3, 21.9, 29.1};

        //get index of max and min
        int maxIndex = 0;
        int minIndex = 100;
        for (int i = 0; i < time.length; i++) {
            if (time[i] > time[maxIndex]) {
                maxIndex = i;
            }
            if (time[i] < time[minIndex]) {
                minIndex = i;
            }
        }

        //remove outliers
        double[ ] time2 = new double[time.length - 2];
        for (double i : time) {
            if (i != time[maxIndex] && i != time[minIndex]) {
                time2[time2.length] = i;
            }
        }

        //calculate average
        double sum = 0;
        for (double i : time2) {
            sum += i;
        }
        double average = sum / time2.length;
        return average;

    }
}
