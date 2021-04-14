package service;
import java.util.Scanner;

import bean.*;

public class EmployeeService implements Services {

	Employee e = new Employee();
	Scanner sc = new Scanner(System.in);
	@Override
	public void getInfoFromUser() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter id:");
		e.setId(Long.parseLong(sc.nextLine()));
		System.out.println("Enter name:");
		e.setName(sc.nextLine());
		System.out.println("Enter salary:");
		e.setSalary(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter Designation:");
		e.setDesignation(sc.nextLine());
		
		
		
	}

	@Override
	public void findScheme() {
		
		if(e.getDesignation().equals("Manager") || e.getDesignation().equals("HR") || e.getSalary()>300000) {
			e.setInsuranceScheme("One time Investment");
		}
		else if(e.getDesignation().equals("Project Leader") || e.getDesignation().equals("Mentor") || (e.getSalary()>100000 && e.getSalary()<300000)) {
			e.setInsuranceScheme("Yearly");
			
		}
		
		else {
			e.setInsuranceScheme("Monthly");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayUserInfo() {
		// TODO Auto-generated method stub
		
		System.out.println("Name : " +e.getName());
		System.out.println("Employee ID : "+e.getId());
		System.out.println("Salary : "+e.getSalary());
		System.out.println("Designation : "+e.getDesignation());
		System.out.println("Insuarance Scheme : "+e.getInsuranceScheme());
		
	}
	

}
