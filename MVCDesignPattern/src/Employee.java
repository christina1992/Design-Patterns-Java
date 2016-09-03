/**
 * Created by hnastevska on 8/18/2016.
 */
public class Employee {
    String name;
    String idNumber;

    public Employee(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
