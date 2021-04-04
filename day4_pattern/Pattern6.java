package day4basics;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows: ");
		int n=sc.nextInt();
		Pattern6 obj=new Pattern6();
		obj.method(n);
	}
	void method(int n)
	{
		int i=0,j=0;
		for (i=1;i<=n;i++)//for printing the upper triangle
		{
			for (j=1;j<=n-i;j++)			
				System.out.print(" ");
	        for (j=1;j<=2*i-1;j++)
	        	System.out.print("*");
			System.out.print("\n");
		}
		for (i=n-1;i>=1;i--)//for printing the lower triangle i.e one row less than the number of rows given by the user
		{
			for (j=1;j<=n-i;j++)			
				System.out.print(" ");
	        for (j=1;j<=2*i-1;j++)
	        	System.out.print("*");
			System.out.print("\n");
		}
	
	
	}

}
