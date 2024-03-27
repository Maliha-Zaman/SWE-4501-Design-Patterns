package DecoratorPattern;

import StrategyPattern.Car;
import StrategyPattern.EngineStrategy;
import StrategyPattern.TurboChargerStrategy;

public abstract class NOS extends Car {

    private Car car;

    public NOS(Car car) {
        super(car.getEngineStrategy(), car.getTurbochargerStrategy());
        this.car = car;
    }

    @Override
    public void start() {
        System.out.println("Starting NOS");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating with NOS");
    }

    @Override
    public void stop() {
        System.out.println("Stopping with NOS");
    }

    public abstract void apply();
}