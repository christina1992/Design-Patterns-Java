/**
 * Created by hnastevska on 8/18/2016.
 */
public class MVCDemo {
    public static void main(String... args) {

        Employee model = getEmployeeFromDatabase();

        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();
        controller.setEmployeeName("Filip");
        controller.updateView();

    }

    public static Employee getEmployeeFromDatabase() {
        Employee employee = new Employee();
        employee.setIdNumber("12j");
        employee.setName("Christina");
        return employee;
    }
}
