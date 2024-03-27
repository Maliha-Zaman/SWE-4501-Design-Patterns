public class Clothing implements Product {
    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}
