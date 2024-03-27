package DecoratorPattern;

import StrategyPattern.Car;
import StrategyPattern.EngineStrategy;
import StrategyPattern.TurboChargerStrategy;

public class Sema extends NOS {
    public Sema(Car car) {
        super(car);
    }

    @Override
    public void apply() {
        System.out.println("Applying Sema Nitrous Oxide System");
    }

    @Override
    public NOS selectNOS() {
        return new Sema(this);
    }
}