package dynamic_proxy;

import static_proxy.Image;

import java.lang.reflect.Proxy;

public class DynamicImageFactory {

    /* Dynamically creates the proxy */

    public static Image getImage() {
        return (Image) Proxy.newProxyInstance(DynamicImageFactory.class.getClassLoader(), new Class[] {Image.class}, new ImageInvocationHandler());
    }

}
