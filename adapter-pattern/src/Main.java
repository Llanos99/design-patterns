import class_adapter.BusinessCardDesigner;
import class_adapter.Employee;
import class_adapter.EmployeeClassAdapter;
import object_adapter.EmployeeObjectAdapter;

public class Main {
    public static void main(String[] args) {
        /* Using class/two-way adapter */
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);
        /* Using object adapter */
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        String card1 = designer.designCard(objectAdapter);
        System.out.println(card1);
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Anderson Llanos");
        employee.setJobTittle("Software Engineer");
        employee.setOfficeLocation("AK 14 #47-63");
    }
}