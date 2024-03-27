package FactoryPattern;

import StrategyPattern.AlpineTurbochargerStrategy;
import StrategyPattern.CumminsTurbochargerStrategy;
import StrategyPattern.HoneywellTurbochargerStrategy;
import StrategyPattern.TurboChargerStrategy;

public class TurboChargerStrategyFactory {
    public static TurboChargerStrategy createTurbochargerStrategy(String turbochargerType) {
        switch (turbochargerType.toLowerCase()) {
            case "alpine":
                return new AlpineTurbochargerStrategy();
            case "cummins":
                return new CumminsTurbochargerStrategy();
            case "honeywell":
                return new HoneywellTurbochargerStrategy();
            default:
                throw new IllegalArgumentException("Invalid turbocharger type: " + turbochargerType);
        }
    }
}
