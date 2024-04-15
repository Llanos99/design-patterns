/* Concrete observer */
public class QuantityObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        int count = order.getCount();
        /* The order changed, the updated method checks if it has to implement an action in the order */
        if (count <= 5) {
            order.setShippingCost(10);
        } else {
            order.setShippingCost(10 + (count - 5) * 1.5);
        }
    }
}
