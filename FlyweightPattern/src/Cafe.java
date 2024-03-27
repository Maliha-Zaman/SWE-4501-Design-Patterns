public class Cafe {

    public static void main(String[] args) {
        CoffeeOrder americano = CoffeeOrderFactory.getCoffeeOrder("Americano");
        CoffeeOrder latte = CoffeeOrderFactory.getCoffeeOrder("Latte");
        CoffeeOrder americanoAgain = CoffeeOrderFactory.getCoffeeOrder("Americano");

        americano.serveCoffee(1);
        latte.serveCoffee(2);
        americanoAgain.serveCoffee(3);
    }

}


