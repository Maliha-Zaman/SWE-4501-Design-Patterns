package DecoratorPattern;

import StrategyPattern.Car;
import StrategyPattern.EngineStrategy;
import StrategyPattern.TurboChargerStrategy;

public class Resonac extends NOS {
    public Resonac(Car car) {
        super(car);
    }

    @Override
    public void apply() {
        System.out.println("Applying Sema Nitrous Oxide System");
    }

    @Override
    public NOS selectNOS() {
        return new Resonac(this);
    }
}
