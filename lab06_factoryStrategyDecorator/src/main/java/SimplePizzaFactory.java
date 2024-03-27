public class SimplePizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        if ("Cheese".equalsIgnoreCase(type)) {
            return new CheesePizza();
        } else if ("Pepperoni".equalsIgnoreCase(type)) {
            return new PepperoniPizza();
        }
        return null;
    }
}