
class Square implements Shape {

    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square with length " + length);
    }
}
