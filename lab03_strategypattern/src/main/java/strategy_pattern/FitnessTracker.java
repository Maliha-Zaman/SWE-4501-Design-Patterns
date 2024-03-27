package strategy_pattern;

public class FitnessTracker {
    private ActivityCalorieCalculator calorieCalculator;

    public FitnessTracker(ActivityCalorieCalculator calorieCalculator) {
        this.calorieCalculator = calorieCalculator;
    }

    public double trackCaloriesBurned(double durationInMinutes) {
        return calorieCalculator.calculateCaloriesBurned(durationInMinutes);
    }
}
