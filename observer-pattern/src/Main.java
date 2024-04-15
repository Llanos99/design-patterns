public class Main {
    public static void main(String[] args) {
        Order order = new Order("100");
        PriceObserver priceObserver = new PriceObserver();
        order.attach(priceObserver);
        order.addItem(50);
        System.out.println(order);
        order.addItem(179);
        System.out.println(order);
    }
}