public class House implements VillageComponent{
    private Shape shape;

    public House(Shape shape) {
        this.shape = shape;
    }


    @Override
    public void display() {
        System.out.print("House: ");
        shape.draw();
    }
}


