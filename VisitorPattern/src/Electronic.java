public class Electronic implements Product{
    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}
