public class ECommerceDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Book());
        cart.addProduct(new Electronic());
        cart.addProduct(new Clothing());

        ShippingVisitor shippingVisitor = new ShippingCostVisitor();
        cart.calculateShippingCost(shippingVisitor);
    }
}