package day4basics;

import java.util.Scanner;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows: ");
		int n=sc.nextInt();
		Pattern7 obj=new Pattern7();
		obj.method(n);
	}
	void method(int n)
	{
		int i=0,j=0;
		for (i=1;i<=n;i++)//for printing the upper triangle
		{
	        for (j=1;j<=2*n-1;j++)
	        {
	        	if (j==(n-(i-1)) || j==n+i-1)
	        	{
	        		System.out.print("*");
	        	}
	        	else
	        	{
	        		System.out.print(" ");
	        	}
	        }
			System.out.print("\n");
		}
		for (i=n-1;i>=1;i--)
		{
			for (j=1;j<=2*n-1;j++)
	        {
	        	if (j==(n-(i-1)) || j==n+i-1)
	        	{
	        		System.out.print("*");
	        	}
	        	else
	        	{
	        		System.out.print(" ");
	        	}
	        }
			System.out.print("\n");
		}
		System.out.print("\n");
	} 
	

}
