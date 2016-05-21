package objects;

import java.util.Observable;

public class SoftwareCompany extends Observable {
	int taskPriority;
	String nameOfTask;
	String deadline;

	public SoftwareCompany() {
	}

	public int getTaskPriority() {
		return taskPriority;
	}

	public String getTaskName() {
		return nameOfTask;
	}

	public String getDeadline() {
		return deadline;
	}

	public void assignmentChanged() {
		setChanged();
		notifyObservers();
	}

	public void setAssignment(int taskPriority, String employee, String deadline) {
		this.taskPriority = taskPriority;
		this.nameOfTask = employee;
		this.deadline = deadline;
		assignmentChanged();
	}

}
