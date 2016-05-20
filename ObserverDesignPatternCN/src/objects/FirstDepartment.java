package objects;
import interfaces.Company;
import interfaces.Observer;
import interfaces.ShowTasksInfo;

public class FirstDepartment implements Observer, ShowTasksInfo {
	int taskPriority;
	String employee;
	String deadline;
	Company company;

	public FirstDepartment(Company company) {
		this.company = company;
		company.registerObserver(this);
	}

	@Override
	public void updateTasks(int priority, String employee, String deadline) {
		this.taskPriority = priority;
		this.employee = employee;
		this.deadline = deadline;
		show();
	}

	@Override
	public void show() {
		System.out.println("FIRST DEPARTMENT - Assigned task to: " + this.employee + " the priority of this task is: " + this.taskPriority
				+ " with deadline: " + this.deadline);

	}

}
