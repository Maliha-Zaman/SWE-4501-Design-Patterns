import java.util.HashMap;
public class CoffeeOrderFactory {
        private static final HashMap<String, CoffeeOrder> orderMap = new HashMap<>();

        public static CoffeeOrder getCoffeeOrder(String coffeeType) {
            CoffeeOrder coffeeOrder = orderMap.get(coffeeType);

            if (coffeeOrder == null) {
                coffeeOrder = new SimpleCoffeeOrder(coffeeType);
                orderMap.put(coffeeType, coffeeOrder);
            }

            return coffeeOrder;
        }
    }

