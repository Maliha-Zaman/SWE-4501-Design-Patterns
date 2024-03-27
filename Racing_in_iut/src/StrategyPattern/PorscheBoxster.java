package StrategyPattern;

import DecoratorPattern.NOS;
import DecoratorPattern.Resonac;

public class PorscheBoxster extends Car {

    public PorscheBoxster(EngineStrategy engineStrategy, TurboChargerStrategy turbochargerStrategy) {
        super(engineStrategy, turbochargerStrategy);
    }
    @Override
    public NOS selectNOS() {
        System.out.println("Selecting DecoratorPattern.Sema for StrategyPattern.PorscheBoxster");
        return new Resonac(this);
    }
}
