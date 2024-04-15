package class_adapter;

/* Client code which requires Customer interface */
public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        String card = "";
        card += customer.getName();
        card += STR."\n\{customer.getDesignation()}";
        card += STR."\n\{customer.getAddress()}";
        return card;
    }

}
