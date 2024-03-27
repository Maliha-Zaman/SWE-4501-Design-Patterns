package strategy_pattern;

public class CyclingCalorieCalculator implements  ActivityCalorieCalculator{
    @Override
    public double calculateCaloriesBurned(double durationInMinutes) {

        return durationInMinutes * 7.0; // Example formula
    }
}
