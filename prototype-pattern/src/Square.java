public class Square extends Shape {

    private int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    public Shape copy() {
        return new Square(this.size);
    }

}
