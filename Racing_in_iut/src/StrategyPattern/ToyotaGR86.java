package StrategyPattern;

import DecoratorPattern.NOS;
import DecoratorPattern.Sema;
import StrategyPattern.Car;
import StrategyPattern.EngineStrategy;
import StrategyPattern.TurboChargerStrategy;

public class ToyotaGR86 extends Car {
    public ToyotaGR86(EngineStrategy engineStrategy, TurboChargerStrategy turbochargerStrategy) {
        super(engineStrategy, turbochargerStrategy);
    }
    @Override
    public NOS selectNOS() {
        System.out.println("Selecting DecoratorPattern.Sema for Toyota");
        return new Sema(this);
    }
}
