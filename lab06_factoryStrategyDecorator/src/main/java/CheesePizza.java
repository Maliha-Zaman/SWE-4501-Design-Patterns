public class CheesePizza implements Pizza {
    @Override
    public String getDescription() {
        return "Cheese Pizza";
    }

    @Override
    public double cost() {
        return 8.0;
    }
}