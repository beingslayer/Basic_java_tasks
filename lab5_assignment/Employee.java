package lab5_assignment;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary: ");
		double salary = sc.nextDouble();
		try {
			if(salary < 3000) {
				String s = String.valueOf(salary);
				throw new EmployeeException("salary : "+salary+" which is less than 3000");
			}
			else {
				System.out.println("salary is above 3000 which is: "+salary);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}