package StrategyPattern;

public class V8EngineStrategy implements EngineStrategy{
    @Override
    public void applyEngineBehaviour() {
        System.out.println("Applying V8 Engine Behavior");
    }
}
