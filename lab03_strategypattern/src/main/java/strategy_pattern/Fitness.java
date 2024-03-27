package strategy_pattern;

public class Fitness {
    public static void main(String[] args) {
        double duration = 30.0;

        FitnessTracker tracker = new FitnessTracker(new WalkingCalorieCalculator());
        System.out.println("Walking: " + tracker.trackCaloriesBurned(duration) + " calories burned");
        tracker = new FitnessTracker(new RunningCalorieCalculator());
        System.out.println("Running: " + tracker.trackCaloriesBurned(duration) + " calories burned");
        tracker= new FitnessTracker(new CyclingCalorieCalculator());
        System.out.println("Cycling: " + tracker.trackCaloriesBurned(duration) + " calories burned");
    }
}
