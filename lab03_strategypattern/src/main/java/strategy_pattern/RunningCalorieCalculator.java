package strategy_pattern;

public class RunningCalorieCalculator implements  ActivityCalorieCalculator{
    @Override
    public double calculateCaloriesBurned(double durationInMinutes) {

        return durationInMinutes * 10.0;
    }
}
