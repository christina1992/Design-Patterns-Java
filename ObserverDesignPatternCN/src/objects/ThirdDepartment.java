package objects;
import interfaces.Observer;
import interfaces.ShowTasksInfo;

public class ThirdDepartment implements Observer, ShowTasksInfo {

	private String leadEmployee;
	private int numOfEmployees = 20;
	private SoftwareCompany company;
	private String deadlineOfCurrentTasks;
	private int tasksPriority;

	public ThirdDepartment(SoftwareCompany company) {
		this.company = company;
		company.registerObserver(this);
	}

	@Override
	public void updateTasks(int priority, String employee, String deadline) {
		this.leadEmployee = employee;
		this.deadlineOfCurrentTasks = deadline;
		this.tasksPriority = priority;
		this.show();
	}

	@Override
	public void show() {
		System.out.println("THIRD DEPARTMENT - The team lead of this department currently is: " + this.leadEmployee + " from total of "
				+ this.numOfEmployees + " employees. They have task with priority: " + this.tasksPriority
				+ " from a scale to 1-10, with deadline " + this.deadlineOfCurrentTasks);

	}

}
