package com.cg.eis.service;
import com.cg.eis.bean.*;
import java.util.Scanner;
public class EmployeeService implements Services{

	
	Employee e = new Employee();
	Scanner sc = new Scanner(System.in);
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
	public void findScheme() {
		// TODO Auto-generated method stub
		if(e.getDesignation().equals("system associate") && (e.getSalary()>5000 && e.getSalary()<20000) ) {
			e.setInsuranceScheme("scheme c");
		}
		else if(e.getDesignation().equals("programmer") && (e.getSalary()>=20000 && e.getSalary()<40000)) {
			e.setInsuranceScheme("scheme b");
			
		}
		else if(e.getDesignation().equals("manager") && e.getSalary()>40000) {
			e.setInsuranceScheme("scheme a");
			
		}
		else if(e.getDesignation().equals("clerk") &&  e.getSalary()<5000) {
			e.setInsuranceScheme("no scheme");
			
		}
		
		else {
			e.setInsuranceScheme("Invalid Scheme");
		}
		
	}
public void displayUserInfo() {
		// TODO Auto-generated method stub
		System.out.println("Name : " +e.getName());
		System.out.println("Employee ID : "+e.getId());
		System.out.println("Salary : "+e.getSalary());
		System.out.println("Designation : "+e.getDesignation());
		System.out.println("Insuarance Scheme : "+e.getInsuranceScheme());
		
	}
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	
	
}