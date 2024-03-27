package StrategyPattern;

import DecoratorPattern.NOS;
import DecoratorPattern.Sema;
import StrategyPattern.Car;
import StrategyPattern.EngineStrategy;
import StrategyPattern.TurboChargerStrategy;

public class SubaruBRZ extends Car {

    public SubaruBRZ(EngineStrategy engineStrategy, TurboChargerStrategy turbochargerStrategy) {
        super(engineStrategy, turbochargerStrategy);
    }

    @Override
    public NOS selectNOS() {
        System.out.println("Selecting DecoratorPattern.Sema StrategyPattern.SubaruBRZ");
        return new Sema(this);
    }

}
