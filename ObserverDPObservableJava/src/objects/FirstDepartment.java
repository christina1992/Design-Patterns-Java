package objects;

import java.util.Observable;
import java.util.Observer;

import interfaces.ShowTasksInfo;

public class FirstDepartment implements Observer, ShowTasksInfo {
	int taskPriority;
	String nameOfTask;
	String deadline;

	public FirstDepartment(Observable observable) {
		observable.addObserver(this);
	}

	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof SoftwareCompany) {
			SoftwareCompany company = (SoftwareCompany) observable;
			this.taskPriority = company.getTaskPriority();
			this.nameOfTask = company.getTaskName();
			this.deadline = company.getDeadline();
			this.show();
		}

	}

	@Override
	public void show() {
		System.out.println("FIRST DEPARTMENT - Task today is : " + this.nameOfTask + " the priority of this task is: "
				+ this.taskPriority + " with deadline: " + this.deadline);

	}
}
