package TemplatePattern;

import DecoratorPattern.NOS;

public abstract class Race {
    public final void race() {
        carInfo();
        trackInfo();
        startCar();
        startLine();
        accelerateCar();

        // Pit stop to apply NOS

        NOS nos = pitStop();
        applyNos(nos);
        finishLine();
        stopCar();
        lapTime();
    }

    abstract void carInfo();

    abstract void trackInfo();

    abstract void startCar();

    abstract void startLine();

    abstract void accelerateCar();

    abstract NOS pitStop();

    abstract void applyNos( NOS nos);

    abstract void finishLine();

    abstract void stopCar();

    abstract void lapTime();
}