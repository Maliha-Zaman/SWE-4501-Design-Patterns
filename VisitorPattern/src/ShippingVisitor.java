public interface ShippingVisitor {
    void visit(Book book);
    void visit(Electronic electronic);
    void visit(Clothing clothing);
}
