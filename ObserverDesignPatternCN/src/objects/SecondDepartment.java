package objects;

import interfaces.Observer;
import interfaces.ShowTasksInfo;

public class SecondDepartment implements Observer, ShowTasksInfo {
	private String nameOfTask;
	private int numOfEmployees = 40;
	private SoftwareCompany company;
	private String deadlineOfCurrentTasks;
	private int tasksPriority;

	public SecondDepartment(SoftwareCompany company) {
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
		System.out.println("SECONT DEPARTMENT - The task is: " + this.nameOfTask + " for  "
				+ this.numOfEmployees + " employees. With  priority: " + this.tasksPriority
				+ " from a scale to 1-10, with deadline " + this.deadlineOfCurrentTasks);

	}

}
