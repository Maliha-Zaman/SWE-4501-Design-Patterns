package StrategyPattern;

public class AlpineTurbochargerStrategy implements TurboChargerStrategy {
    @Override
    public void applyTurbochargerBehavior() {
        System.out.println("Applying Alpine Turbocharger Behavior");
    }
}
