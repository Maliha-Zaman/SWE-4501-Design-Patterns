package FactoryPattern;

import StrategyPattern.EngineStrategy;
import StrategyPattern.V12EngineStrategy;
import StrategyPattern.V6EngineStrategy;
import StrategyPattern.V8EngineStrategy;

public class EngineStrategyFactory {
    public static EngineStrategy createEngineStrategy(String engineType) {
        switch (engineType.toLowerCase()) {
            case "v6":
                return new V6EngineStrategy();
            case "v8":
                return new V8EngineStrategy();
            case "v12":
                return new V12EngineStrategy();
            default:
                throw new IllegalArgumentException("Invalid engine type: " + engineType);
        }
    }
}
