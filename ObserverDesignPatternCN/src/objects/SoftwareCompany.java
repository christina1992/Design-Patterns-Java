package objects;
import java.util.ArrayList;

import interfaces.Company;
import interfaces.Observer;

public class SoftwareCompany implements Company {
	private ArrayList<Observer> observers;
	int taskPriority;
	String employee;
	String deadline;

	public SoftwareCompany() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}

	public int getTaskPriority() {
		return taskPriority;
	}

	public String getEmployee() {
		return employee;
	}

	public String getDeadline() {
		return deadline;
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}

	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.updateTasks(this.getTaskPriority(), this.getEmployee(), this.getDeadline());
		}

	}

	public void assignmentChanged() {
		notifyObservers();
	}

	public void setAssignment(int taskPriority, String employee, String deadline) {
		this.taskPriority = taskPriority;
		this.employee = employee;
		this.deadline = deadline;
		assignmentChanged();
	}

}
