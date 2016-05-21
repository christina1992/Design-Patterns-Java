package main;

import java.util.Observable;
import java.util.Observer;

public class ThirdDepartment implements Observer, ShowTasksInfo {

	private String nameOfTask;
	private int numOfEmployees = 20;
	private String deadlineOfCurrentTasks;
	private int tasksPriority;

	public ThirdDepartment(Observable observable) {
		observable.addObserver(this);
	}

	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof SoftwareCompany) {
			SoftwareCompany company = (SoftwareCompany) observable;
			this.tasksPriority = company.getTaskPriority();
			this.nameOfTask = company.getTaskName();
			this.deadlineOfCurrentTasks = company.getDeadline();
			this.show();
		}

	}

	@Override
	public void show() {
		System.out.println("THIRD DEPARTMENT - The task for today is: " + this.nameOfTask + " assign to "
				+ this.numOfEmployees + " employees. Task priority is: " + this.tasksPriority
				+ " from a scale to 1-10, with deadline " + this.deadlineOfCurrentTasks);

	}

}
