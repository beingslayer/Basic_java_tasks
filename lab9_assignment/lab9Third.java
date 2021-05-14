package lab9;

import java.util.Scanner;
import java.util.function.BiFunction;

public class lab9Third {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String u_name = sc.next();
		System.out.println("Enter password");
		String pass= sc.next();

		BiFunction<String,String,Boolean>validate= (str1,str2) -> {
			if (str1.equals("Suhana") && str2.equals("Capg"))
				return true;
			return false;
		};
		if (validate.apply(u_name,pass))
			System.out.println("Valid credentials");
		else
			System.out.println("Invalid credentials");
	}
}
