import java.util.*;

public class runningAverage {
    private int count;
    private double average;

    public runningAverage(){
        count = 0;
        average = 0.0;
    }

    public void updateAverage(double new){
        count++;
        average = ((average * (count - 1)) + new) / count;
    }

    public int processNewRating(int num){
        int invalidCount = 0;
        for (int i = 0; i < num; i++) {
            double newRating = getNewRating();
            if (newRating < 0) {
                invalidCount++;
            } else {
                updateAverage(newRating);
            }
        }
        return invalidCount;
    }

    public double getNewRating() {
        return 0.0;
    }

    public static void main(String args[]) {
    }
}
