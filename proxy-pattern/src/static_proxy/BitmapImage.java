package static_proxy;

/* Concrete class providing actual functionality */
public class BitmapImage implements Image {

    private CustomPoint2D location;

    private String name;

    public BitmapImage(String filename) {
        System.out.println(STR."Loaded from disk: \{filename}");
        name = filename;
    }

    @Override
    public void setLocation(CustomPoint2D point2D) {
        location = point2D;
    }

    @Override
    public CustomPoint2D getLocation() {
        return location;
    }

    @Override
    public void render() {
        System.out.println(STR."Rendered \{this.name}");
    }
}
