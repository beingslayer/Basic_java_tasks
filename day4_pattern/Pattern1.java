package day4basics;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows: ");
		int n=sc.nextInt();
		Pattern1 obj=new Pattern1();
		obj.method(n);
	}
	void method(int n)
	{
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)			
			{
				System.out.print(" *");
			}
			System.out.print("\n");
		}
	}

}
