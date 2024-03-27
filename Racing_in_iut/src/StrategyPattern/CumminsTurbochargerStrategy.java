package StrategyPattern;

public class CumminsTurbochargerStrategy implements  TurboChargerStrategy{
    @Override
    public void applyTurbochargerBehavior() {
        System.out.println("Applying Cummins Turbocharger Behavior");
    }
}
