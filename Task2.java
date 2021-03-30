package day1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		float basic_salary,total,takeaway_salary;
		float hra,da,tax;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the basic salary");
		basic_salary=sc.nextInt();
		hra=(float) (0.4*basic_salary);
		da=(float) (0.6*(basic_salary+hra));
		total=basic_salary+hra+da;
		if(basic_salary<200000)
		{
			tax=0;
		}
		else if(basic_salary>=200000 && basic_salary<=600000)
		{
			tax=(float) (0.1*total); 
		}
		else {
			tax=(float) (0.2*total);
		}
		takeaway_salary=total-tax;
		System.out.println("Home Takeaway Salary: "+takeaway_salary+
				"\nHome Rental Allowance:"+hra+"\nDearness Allowance:"
				+da+"\nTAX:"+tax);
	
}
}
