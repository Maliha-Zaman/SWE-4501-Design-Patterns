package FactoryPattern;

import StrategyPattern.Car;
import TemplatePattern.CircuitRace;
import TemplatePattern.Race;
import TemplatePattern.SprintRace;

public class RaceFactory {
    public static Race createRace(String racingType, Car car, Track track) {
        Race race;
        if ("sprint".equalsIgnoreCase(racingType)) {
            race = new SprintRace(car, track);
        } else if ("circuit".equalsIgnoreCase(racingType)) {
            race = new CircuitRace(car, track);
        } else {
            throw new IllegalArgumentException("Invalid racing type: " + racingType);
        }
        return race;
    }
}
