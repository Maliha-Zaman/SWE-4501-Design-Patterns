import FactoryPattern.*;
import SingletonPattern.Player;
import StrategyPattern.Car;
import StrategyPattern.EngineStrategy;
import StrategyPattern.TurboChargerStrategy;
import TemplatePattern.Race;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // SingletonPattern.Player input
    System.out.println("Enter your player name:");
    String playerName = scanner.nextLine();

    Player player1 = Player.getInstance();
    if (player1.setPlayerName(playerName)) {
        System.out.println("SingletonPattern.Player 1 Name: " + player1.getPlayerName());
    } else {
        System.out.println("A player instance already exists with the name: " + player1.getPlayerName());
    }

    // Attempt to create another instance
    Player player2 = Player.getInstance();
    if (player2.setPlayerName("SecondPlayer")) {
        System.out.println("SingletonPattern.Player 2 Name: " + player2.getPlayerName());
    } else {
        System.out.println("A player instance already exists with the name: " + player2.getPlayerName());
    }

    // StrategyPattern.Car category input
    System.out.println("Choose car category (1 for Coupe, 2 for Roadster):");
    int carCategory = scanner.nextInt();

    CarProducer carProducer = new CarProducer();
    CarFactory carFactory = carProducer.createCarFactory(carCategory);

    // StrategyPattern.Car type input
    System.out.println("Choose car type ((SubaruBRZ, ToyotaGR86)-for coupe, (PorscheBoxster, Ferrari812)-for roadster:");
    String carType = scanner.next();
    System.out.println("Choose engine strategy (V6, V8, V12):");
    String engineType = scanner.next();
    EngineStrategy engineStrategy = EngineStrategyFactory.createEngineStrategy(engineType);

    // Turbocharger strategy input
    System.out.println("Choose turbocharger strategy (Alpine, Cummins, Honeywell):");
    String turbochargerType = scanner.next();
    TurboChargerStrategy turbochargerStrategy = TurboChargerStrategyFactory.createTurbochargerStrategy(turbochargerType);
    Car car = carFactory.createCar(engineStrategy, turbochargerStrategy, carType);

    // FactoryPattern.Track type input
    System.out.println("Choose track option (BlueMoonBaySpeedway, BBRaceway, CircuitSpaFrancorchamps):");
    String trackType = scanner.next();
    TrackFactory trackFactory = new TrackFactory();
    Track track = trackFactory.createTrack(trackType);

    // Racing type input
    System.out.println("Choose racing type (sprint or circuit):");
    String racingType = scanner.next();
    System.out.println("Starting " + racingType + " Racing....");

    car.applyEngineBehavior();
    car.applyTurbochargerBehavior();
    // Create and run the race
    Race race = RaceFactory.createRace(racingType, car, track);
    race.race();
}

}
