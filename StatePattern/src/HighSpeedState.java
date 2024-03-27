class HighSpeedState implements FanState {
    @Override
    public void changeSpeed(FanContext context) {
        System.out.println("Turning the fan off.");
        context.setState(new OffState());
    }
}
