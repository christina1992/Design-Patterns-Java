package objects;
import interfaces.Company;
import interfaces.Observer;
import interfaces.ShowTasksInfo;

public class FirstDepartment implements Observer, ShowTasksInfo {
	int taskPriority;
	String nameOfTask;
	String deadline;
	Company company;

	public FirstDepartment(Company company) {
		this.company = company;
		company.registerObserver(this);
	}

	@Override 
	public void updateTasks(int priority, String nameOfTask, String deadline) {
		this.taskPriority = priority;
		this.nameOfTask = nameOfTask;
		this.deadline = deadline;
		show();
	}

	@Override
	public void show() {
		System.out.println("FIRST DEPARTMENT - Task today is : " + this.nameOfTask + " the priority of this task is: " + this.taskPriority
				+ " with deadline: " + this.deadline);

	}

}
