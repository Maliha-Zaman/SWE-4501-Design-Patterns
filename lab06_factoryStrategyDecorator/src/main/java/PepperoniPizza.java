public class PepperoniPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Pepperoni Pizza";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
