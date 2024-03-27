package FactoryPattern;

import StrategyPattern.*;

public class RoadsterCarFactory extends CarFactory{

    @Override
    public Car createCar(EngineStrategy engineStrategy, TurboChargerStrategy turbochargerStrategy, String carType) {
        if ("PorscheBoxster".equalsIgnoreCase(carType)) {
            return new PorscheBoxster(engineStrategy, turbochargerStrategy);
        } else if ("Ferrari812".equalsIgnoreCase(carType)) {
            return new Ferrari812(engineStrategy, turbochargerStrategy);
        } else {
            // Handle unknown car type, throw exception or return a default car
            throw new IllegalArgumentException("Invalid car type: " + carType);
        }
    }
    }

