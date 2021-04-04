package day4basics;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows: ");
		int n=sc.nextInt();
		Pattern4 obj=new Pattern4();
		obj.method(n);
	}
	void method(int n)
	{
		int i=0,j=0;
		for (i=1;i<=n;i++)
		{
			for (j=1;j<=n-i;j++)			
				System.out.print(" ");
	        for (j=1;j<=i;j++)
	        	System.out.print("*");
	        for (j=1;j<=i-1;j++)
	        	System.out.print("*");
			System.out.print("\n");
		}
	
	}

}
