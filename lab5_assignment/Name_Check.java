package lab5_assignment;

import java.util.Scanner;

public class Name_Check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		String s[]=name.split(" ");
		try {
			if(s[0].equals("_")&&s[1].equals("_")) {
				throw new NameException("first Name is: "+s[0]+", Last Name is: "+s[1]+". so re-enter your name.");
			}
			else {
				System.out.println("first Name is: "+s[0]+", and Last Name is: "+s[1]);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}