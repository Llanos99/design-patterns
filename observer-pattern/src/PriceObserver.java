/* Concrete observer */
public class PriceObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        double total = order.getItemCost();
        /* The order changed, the updated method checks if it has to implement an action in the order */
        if (total >= 500) {
            order.setDiscount(20);
        } else if (total >= 200) {
            order.setDiscount(10);
        }
    }
}
