package main;

import objects.FirstDepartment;
import objects.SecondDepartment;
import objects.SoftwareCompany;
import objects.ThirdDepartment;

public class CompanySimulator {

	public static void main(String[] args) {
		SoftwareCompany company = new SoftwareCompany();
		
		FirstDepartment firstDepartment = new FirstDepartment(company);
		SecondDepartment secondDepartment = new SecondDepartment(company);
		ThirdDepartment thirdDepartment = new ThirdDepartment(company);
		
		company.setAssignment(7,"Task 1 of the day ", "1/6/2016");
		System.out.println("\n");
		company.setAssignment(5, "Task 2 of the day", "1/7/2016");
		System.out.println("\n");
		company.setAssignment(8, "Task 3 of the day", "17/7/2016");

	}

}
