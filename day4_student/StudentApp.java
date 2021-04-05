package day4_student;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {

		System.out.println("Enter the ID, Name, DBMS Marks and C++ Marks");
		int DBMSMarks, CMarks;
		String  studentId, studentName;

		Scanner sc = new Scanner(System.in);
		System.out.print("ID:-");
		studentId = sc.nextLine();
		System.out.print("Name:");
		studentName = sc.nextLine();
		System.out.print("DBMS Marks:");
		DBMSMarks = sc.nextInt();
		System.out.print("C++ Marks::");
		CMarks = sc.nextInt();

		Student s1 = new Student(studentName, studentId, DBMSMarks, CMarks);
		s1.calculateMarks();
		s1.printDetails();
	}

}