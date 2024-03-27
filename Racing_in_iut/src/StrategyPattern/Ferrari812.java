package StrategyPattern;

import DecoratorPattern.NOS;
import DecoratorPattern.Resonac;
import StrategyPattern.Car;
import StrategyPattern.EngineStrategy;
import StrategyPattern.TurboChargerStrategy;

public class Ferrari812 extends Car {
    public Ferrari812(EngineStrategy engineStrategy, TurboChargerStrategy turbochargerStrategy) {
        super(engineStrategy, turbochargerStrategy);
    }
    @Override
    public NOS selectNOS() {
        System.out.println("Selecting DecoratorPattern.Sema for Ferrari");
        return new Resonac(this);
    }
}
