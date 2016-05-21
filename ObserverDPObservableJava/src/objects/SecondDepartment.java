package objects;

import java.util.Observable;
import java.util.Observer;

import interfaces.ShowTasksInfo;

public class SecondDepartment implements Observer, ShowTasksInfo {
	private String nameOfTask;
	private int numOfEmployees = 40;
	private String deadlineOfCurrentTasks;
	private int tasksPriority;

	public SecondDepartment(Observable observable) {
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
		System.out.println("SECONT DEPARTMENT - The task is: " + this.nameOfTask + " for  " + this.numOfEmployees
				+ " employees. With  priority: " + this.tasksPriority + " from a scale to 1-10, with deadline "
				+ this.deadlineOfCurrentTasks);

	}

}
