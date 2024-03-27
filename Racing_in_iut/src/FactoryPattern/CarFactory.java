package FactoryPattern;

import StrategyPattern.Car;
import StrategyPattern.EngineStrategy;
import StrategyPattern.TurboChargerStrategy;

public abstract class CarFactory {
        public abstract Car createCar(EngineStrategy engineStrategy, TurboChargerStrategy turbochargerStrategy, String carType);

}
