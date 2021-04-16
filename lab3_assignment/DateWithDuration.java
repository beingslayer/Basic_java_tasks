package lab3;

import java.time.LocalDate;
import java.util.Scanner;

public class DateWithDuration {
	public static LocalDate sysDate;
	public static void main(String[] args) {
		
		sysDate = LocalDate.now();
		System.out.println("Enter date in (yyyy-mm-dd) format : " );
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		LocalDate inputDate = LocalDate.parse(inputString);
		
		System.out.println("Years remaining : "+ (  Math.abs(sysDate.getYear()-inputDate.getYear())    ));
		System.out.println("Months remaining : "+ (  Math.abs(sysDate.getMonthValue()-inputDate.getMonthValue())    ));
		System.out.println("Days remaining : "+ (  Math.abs(sysDate.getDayOfMonth()-inputDate.getDayOfMonth())    ));
	}
}
