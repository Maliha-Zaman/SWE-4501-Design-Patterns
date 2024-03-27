class LowSpeedState implements FanState {
    @Override
    public void changeSpeed(FanContext context) {
        System.out.println("Increasing fan speed to medium.");
        context.setState(new MediumSpeedState());
    }
}