package object_adapter;

import class_adapter.Customer;
import class_adapter.Employee;

public class EmployeeObjectAdapter implements Customer {

    private Employee adaptee;

    public EmployeeObjectAdapter(Employee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getName() {
        return adaptee.getFullName();
    }

    @Override
    public String getDesignation() {
        return adaptee.getJobTittle();
    }

    @Override
    public String getAddress() {
        return adaptee.getOfficeLocation();
    }
}
