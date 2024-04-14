public class Rectangle extends Shape {

    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape copy() {
        return new Rectangle(this.width, this.height);
    }

}
