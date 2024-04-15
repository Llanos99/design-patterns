import java.util.ArrayList;
import java.util.List;

/* A concrete subject */
public class Order {

    private String id;

    private double itemCost;

    private int count;

    private double discount;

    private double shippingCost;

    public Order(String id) {
        this.id = id;
    }

    public double getTotal() {
        return itemCost - discount + shippingCost;
    }

    public double getItemCost() {
        return itemCost;
    }

    public int getCount() {
        return count;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    /* Here comes the observer pattern implementation */

    /* This is the only method that triggers object state change */
    public void addItem(double price) {
        itemCost += price;
        count++;
        /* Send out notification to all observer whose state has changed */
        observers.forEach(observer -> observer.updated(this));
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public List<OrderObserver> observers = new ArrayList<>();

    @Override
    public String toString() {
        return STR."Order{id='\{id}\{'\''}, itemCost=\{itemCost}, count=\{count}, discount=\{discount}, shippingCost=\{shippingCost}\{'}'}";
    }
}
