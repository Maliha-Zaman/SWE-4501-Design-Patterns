public class Order {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new SimplePizzaFactory();

        // Order a simple cheese pizza
        Pizza cheesePizza = pizzaFactory.createPizza("Cheese");
        System.out.println("Order: " + cheesePizza.getDescription());
        System.out.println("Cost: $" + cheesePizza.cost());

        // Add mushroom topping to the cheese pizza
        Pizza mushroomCheesePizza = new MushroomTopping(cheesePizza);
        System.out.println("Order: " + mushroomCheesePizza.getDescription());
        System.out.println("Cost: $" + mushroomCheesePizza.cost());

        // Order a pepperoni pizza with onions
        Pizza pepperoniPizza = pizzaFactory.createPizza("Pepperoni");
        Pizza pepperoniPizzaWithOnions = new OnionTopping(pepperoniPizza);
        System.out.println("Order: " + pepperoniPizzaWithOnions.getDescription());
        System.out.println("Cost: $" + pepperoniPizzaWithOnions.cost());



        PaymentContext paymentContext = new PaymentContext(new CashPayment());
        paymentContext.executePayment(mushroomCheesePizza.cost());
        paymentContext = new PaymentContext(new CreditCardPayment("1234","Maliha"));
        paymentContext.executePayment(pepperoniPizzaWithOnions.cost());

    }
}