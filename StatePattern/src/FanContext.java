public class FanContext {
    private FanState currentState;

    public FanContext() {
        currentState = new OffState();
    }

    public void setState(FanState state) {
        currentState = state;
    }

    public FanState getState() {
        return currentState;
    }

    public void changeSpeed() {
        currentState.changeSpeed(this);
    }
}

