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
		
		company.setAssignment(7,"Christina Nastevska", "1/6/2016");
		System.out.println("\n");
		company.setAssignment(5, "Christina Nastevska", "1/7/2016");
		System.out.println("\n");
		company.setAssignment(8, "Christina Nastevska", "17/7/2016");

	}

}
