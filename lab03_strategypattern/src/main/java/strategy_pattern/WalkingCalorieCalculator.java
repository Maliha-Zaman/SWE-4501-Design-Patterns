package strategy_pattern;

public class WalkingCalorieCalculator implements ActivityCalorieCalculator{
    @Override
    public double calculateCaloriesBurned(double durationInMinutes) {

        return durationInMinutes * 4.0;
    }
}
