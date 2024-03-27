public class Book implements Product{
    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}
