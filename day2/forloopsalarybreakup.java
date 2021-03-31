package day1;

import java.util.Iterator;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		int num;
		float basic_salary = 0,total,takeaway_salary;
		float hra,da,tax;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of employee");
		num=sc.nextInt();
		System.out.println("Enter the basic salary");
		for(int i=0;i<num;i++) {
		basic_salary=sc.nextInt();
		
		hra=(float) (0.4*basic_salary);
		da=(float) (0.6*(basic_salary+hra));
		total=(basic_salary+hra+da)*12;
		if(total<200000)
		{
			tax=0;
		}
		else if(total>=200000 && total<=600000)
		{
			tax=(float) (0.1*total); 
		}
		else {
			tax=(float) (0.2*total);
		}
		takeaway_salary=total-tax;
		
		System.out.println("Employee no"+i);
		System.out.println("Annual Home Takeaway Salary: "+takeaway_salary+
				"\nMonthly Home Rental Allowance:"+hra+"\nMonthly Dearness Allowance:"
				+da+"\nTAX:"+tax);
		}
}
}
