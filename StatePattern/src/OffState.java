class OffState implements FanState {
    @Override
    public void changeSpeed(FanContext context) {
        System.out.println("Turning the fan on to low speed.");
        context.setState(new LowSpeedState());
    }
}
