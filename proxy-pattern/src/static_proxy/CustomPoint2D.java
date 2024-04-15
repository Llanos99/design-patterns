package static_proxy;

public class CustomPoint2D {

    private float x, y;

    public CustomPoint2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return STR."Point2D{x=\{x}, y=\{y}\{'}'}";
    }
}
