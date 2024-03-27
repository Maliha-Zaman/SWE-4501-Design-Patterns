public class ShippingCostVisitor implements ShippingVisitor {
    @Override
    public void visit(Book book) {
        System.out.println("Calculating shipping cost for a book.");

    }

    @Override
    public void visit(Electronic electronic) {
        System.out.println("Calculating shipping cost for an electronic product.");

    }

    @Override
    public void visit(Clothing clothing) {
        System.out.println("Calculating shipping cost for clothing.");

    }
}
