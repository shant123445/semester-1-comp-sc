public class StepTracker {
    private int daysTracked;

    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
        this.dailySteps = new int[30];
        this.totalSteps = 0;
        this.daysTracked = 0;
    }

    public void addDailySteps(int steps) {
        if (daysTracked < dailySteps.length) {
            dailySteps[daysTracked] = steps;
            totalSteps += steps;
            daysTracked++;
        }
    }

    public int activeDays() {
        int activeDaysCount = 0;
        for (int i = 0; i < daysTracked; i++) {
            if (dailySteps[i] >= minSteps) {
                activeDaysCount++;
            }
        }
        return activeDaysCount;
    }

    public double averageSteps() {
        if (daysTracked == 0) {
            return 0.0;
        }
        return (double) totalSteps / daysTracked;
    }
}
