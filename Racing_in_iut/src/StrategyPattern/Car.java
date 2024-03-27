package StrategyPattern;

import DecoratorPattern.NOS;

public abstract class Car {
    private EngineStrategy engineStrategy;
    private TurboChargerStrategy turbochargerStrategy;

    public Car(EngineStrategy engineStrategy, TurboChargerStrategy turbochargerStrategy) {
        this.engineStrategy = engineStrategy;
        this.turbochargerStrategy = turbochargerStrategy;
    }

    public void setEngineStrategy(EngineStrategy engineStrategy) {
        this.engineStrategy = engineStrategy;
    }

    public void setTurbochargerStrategy(TurboChargerStrategy turbochargerStrategy) {
        this.turbochargerStrategy = turbochargerStrategy;
    }

    public void start() {
        System.out.println("Starting the car...");
    }

    public void stop() {
        System.out.println("Stopping the car...");
    }

    public void accelerate() {
        System.out.println("Accelerating the car...");
    }

    public void applyEngineBehavior() {
        if (engineStrategy != null) {
            engineStrategy.applyEngineBehaviour();
        }
    }

    public void applyTurbochargerBehavior() {
        if (turbochargerStrategy != null) {
            turbochargerStrategy.applyTurbochargerBehavior();
        }
    }

    public void carInfo() {
        System.out.println("StrategyPattern.Car Information:");
        System.out.println("StrategyPattern.Car Type: " + this.getClass().getSimpleName());
    }

    public EngineStrategy getEngineStrategy() {
        return engineStrategy;
    }

    public TurboChargerStrategy getTurbochargerStrategy() {
        return turbochargerStrategy;
    }

    public NOS pitStop() {
        System.out.println("Performing Pit Stop");
        return selectNOS();
    }

    public abstract NOS selectNOS();
}
