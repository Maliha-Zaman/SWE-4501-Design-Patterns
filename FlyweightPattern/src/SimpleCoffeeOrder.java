public class SimpleCoffeeOrder implements CoffeeOrder {

    private String coffeeType;

    public SimpleCoffeeOrder(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    @Override
    public void serveCoffee(int tableNumber) {
        System.out.println("Serving a cup of " + coffeeType + " to table number " + tableNumber);
    }
}
