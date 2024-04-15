package static_proxy;

/* Interface implemented by proxies and concrete objects */
public interface Image {

    void setLocation(CustomPoint2D point2D);

    CustomPoint2D getLocation();

    void render();

}
