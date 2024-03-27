package FactoryPattern;

import StrategyPattern.*;

public class CoupeCarFactory extends  CarFactory{


    @Override
    public Car createCar(EngineStrategy engineStrategy, TurboChargerStrategy turbochargerStrategy, String carType) {
        if ("ToyotaGR86".equalsIgnoreCase(carType)) {
            return new ToyotaGR86(engineStrategy, turbochargerStrategy);
        } else if ("SubaruBRZ".equalsIgnoreCase(carType)) {
            return new SubaruBRZ(engineStrategy, turbochargerStrategy);
        } else {
            // Handle unknown car type, throw exception or return a default car
            throw new IllegalArgumentException("Invalid car type: " + carType);
        }

    }
}
