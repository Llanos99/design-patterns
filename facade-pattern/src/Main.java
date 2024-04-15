public class Main {
    public static void main(String[] args) {
        Order order = new Order("101", 99);
        /* Instantiate the facade : Make easier for the client and the subsystem to determine the task */
        EmailFacade facade = new EmailFacade();
        boolean result = facade.sendOrderEmail(order);
        System.out.println(STR."Order email \{result ? "sent!" : "NOT sent!"}");
    }
}