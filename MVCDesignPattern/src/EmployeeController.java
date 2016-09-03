/**
 * Created by hnastevska on 8/18/2016.
 */
public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController() {
    }

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeNumber(String number) {
        model.setIdNumber(number);
    }

    public String getEmployeeNumber() {
        return model.getIdNumber();
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getIdNumber());
    }
}
