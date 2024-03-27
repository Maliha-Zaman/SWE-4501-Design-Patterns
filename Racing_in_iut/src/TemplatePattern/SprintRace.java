package TemplatePattern;

import DecoratorPattern.NOS;
import FactoryPattern.Track;
import StrategyPattern.Car;
import TemplatePattern.Race;

import java.util.Random;

public class SprintRace extends Race {
    private Car car;
    private Track track;

    public SprintRace(Car car, Track track) {
        this.car = car;
        this.track = track;
    }

    @Override
    void carInfo() {
        car.carInfo();
    }

    @Override
    void trackInfo() {
        track.trackInfo();
    }

    @Override
    void startCar() {
        car.start();
    }

    void startLine() {
        System.out.println("Starting Line of the track: " + track.getTrackName());
    }

    @Override
    void accelerateCar() {
        car.accelerate();
    }

    @Override
    NOS pitStop() {
        return car.pitStop();
    }

    @Override
    void applyNos(NOS nos) {
        if (nos != null) {
            nos.apply();
        } else {
            System.out.println("No DecoratorPattern.NOS applied during the race");
        }
    }


    @Override
    void finishLine() {
        System.out.println("Finish Line of the track: " + track.getTrackName());
    }
    @Override
    void stopCar() {
        System.out.println("Stopping " + car.getClass().getSimpleName() +
                " at " + track.getTrackName());
        car.stop();
    }

    @Override
    void lapTime() {
        // Use Random or any logic to generate lap time
        System.out.println("Lap Time: " + generateRandomLapTime());
    }

    private String generateRandomLapTime() {
        Random random = new Random();

        int hours = random.nextInt(24);
        int minutes = random.nextInt(60);
        int seconds = random.nextInt(60);

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

