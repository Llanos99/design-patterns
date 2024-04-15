package class_adapter;

/* A class adapter, works as two-way adapter */
public class EmployeeClassAdapter extends Employee implements Customer {

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTittle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}
