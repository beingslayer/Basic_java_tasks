package day1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		int eng_marks,java,db_marks,springTools,total_marks,avg;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the marks of English,java,database and springTools");
		eng_marks=sc.nextInt();
		java=sc.nextInt();
		db_marks=sc.nextInt();
		springTools=sc.nextInt();
		total_marks=eng_marks+java+db_marks+springTools;
		avg=total_marks/4;
		System.out.println("Total marks:"+total_marks);
		System.out.println("Average marks:"+avg);
	}
}
