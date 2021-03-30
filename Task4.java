package day1;

import java.util.Scanner;

public class Task4 {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the date");
		int dd=sc.nextInt();
		if(dd>0 && dd<=31) 
		{
			int last_digit=dd%10;
			if(dd==11)
			{
				System.out.println(""+dd+"th");
			}
			else if(last_digit==1)
			{
				System.out.println(""+dd+"st");
			}
			else if(last_digit==2) {
				System.out.println(""+dd+"nd");
			}
			else
			{
				System.out.println(""+dd+"rd");
			}
		
		}
		else {
			System.out.println("Invalid Date");
		}
	}
}