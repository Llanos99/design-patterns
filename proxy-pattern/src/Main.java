import dynamic_proxy.DynamicImageFactory;
import static_proxy.CustomPoint2D;
import static_proxy.Image;
import static_proxy.ImageFactory;

public class Main {
    public static void main(String[] args) {
        /* Static proxy */
        Image img = ImageFactory.getImage("A1.bmp");
        img.setLocation(new CustomPoint2D(10, 10));
        System.out.println(STR."Image location : \{img.getLocation()}");
        System.out.println("Rendering image now...");
        img.render();
        System.out.println("Dynamic proxy ...");
        /* Dynamic proxy */
        Image img1 = DynamicImageFactory.getImage();
        img1.setLocation(new CustomPoint2D(-10, 0));
    }
}