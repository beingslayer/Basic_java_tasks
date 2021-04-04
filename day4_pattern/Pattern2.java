package day4basics;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows: ");
		int n=sc.nextInt();
		Pattern2 obj=new Pattern2();
		obj.method(n);
	}
	void method(int n)
	{
		int k=1;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)			
			{
				System.out.print(" "+k++);
			}
			System.out.print("\n");
		}
	}
}
