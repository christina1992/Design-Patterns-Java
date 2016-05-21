package objects;
import interfaces.Observer;
import interfaces.ShowTasksInfo;

public class ThirdDepartment implements Observer, ShowTasksInfo {

	private String nameOfTask;
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
		this.nameOfTask = employee;
		this.deadlineOfCurrentTasks = deadline;
		this.tasksPriority = priority;
		this.show();
	}

	@Override
	public void show() {
		System.out.println("THIRD DEPARTMENT - The task for today is: " + this.nameOfTask + " assign to "
				+ this.numOfEmployees + " employees. Task priority is: " + this.tasksPriority
				+ " from a scale to 1-10, with deadline " + this.deadlineOfCurrentTasks);

	}

}
