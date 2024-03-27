class MediumSpeedState implements FanState {
    @Override
    public void changeSpeed(FanContext context) {
        System.out.println("Increasing fan speed to high.");
        context.setState(new HighSpeedState());
    }
}
