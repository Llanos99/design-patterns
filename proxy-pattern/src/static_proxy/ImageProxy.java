package static_proxy;

/* Proxy class */
public class ImageProxy implements Image {

    private String name;

    private BitmapImage image;

    private CustomPoint2D location;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void setLocation(CustomPoint2D point2D) {
        if (image != null) {
            image.setLocation(point2D);
        } else {
            location = point2D;
        }
    }

    @Override
    public CustomPoint2D getLocation() {
        if (image != null) {
            return image.getLocation();
        }
        return location;
    }

    @Override
    public void render() {
        if (image == null) {
            image = new BitmapImage(name);
            if (location != null) {
                image.setLocation(location);
            }
        }
        image.render();
    }

}
