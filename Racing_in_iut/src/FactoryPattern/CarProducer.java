package FactoryPattern;

public class CarProducer {
    public CarFactory createCarFactory(int carCategory) {
        if (carCategory == 1) {
            return new CoupeCarFactory();
        } else {
            return new RoadsterCarFactory();
        }
    }
}
