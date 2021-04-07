package employee_day4;

import java.util.Scanner;

public class HRSystem {
	public static void main(String args[])
	{
		Employee e1=new Employee();
		Scanner sc=new Scanner(System.in);
		int n;
		do
		{
			System.out.println("enter empid");
			int empid=sc.nextInt();
			e1.setEmpId(empid);
			System.out.println("Enter employee Name ");
			String name=sc.next();
			e1.setEmpName(name);
			System.out.println("Enter Exp");
			int exp=sc.nextInt();
			e1.setExp(exp);
			System.out.println("Enter Salary");
			int salary=sc.nextInt();
			e1.setSalary(salary);
			e1.computeSalary(exp);
			e1.print();
			System.out.println("<0 for exit>");
			n=sc.nextInt();
		}while(n!=0);
	}

}
