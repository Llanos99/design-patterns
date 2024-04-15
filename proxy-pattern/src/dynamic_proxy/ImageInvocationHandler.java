package dynamic_proxy;

import static_proxy.CustomPoint2D;
import static_proxy.Image;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ImageInvocationHandler implements InvocationHandler {

    /* The proxy is dynamically activated based on some criteria : A method, for example */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Method setLocationMethod = Image.class.getMethod("setLocation", CustomPoint2D.class);
        if (setLocationMethod.equals(method)) {
            CustomPoint2D point2D = (CustomPoint2D) args[0];
            System.out.println(STR."From InvocationHandler \{point2D}");
        }
        return null;
    }

}
