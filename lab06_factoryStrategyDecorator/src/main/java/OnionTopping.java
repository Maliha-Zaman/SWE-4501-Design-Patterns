public class OnionTopping extends ToppingDecorator {
    public OnionTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Onions";
    }

    @Override
    public double cost() {
        return pizza.cost() + 1.5;
    }
}