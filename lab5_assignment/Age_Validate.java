package lab5_assignment;

import java.util.Scanner;

public class Age_Validate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		try {
			if(age > 15) {
				System.out.println("age is above 15 i.e., "+age);
			}
			else {
				throw new AgeException("age is: "+age+". It should be above 15");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}