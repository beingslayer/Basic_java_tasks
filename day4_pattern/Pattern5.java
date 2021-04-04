package day4basics;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows: ");
		int n=sc.nextInt();
		Pattern5 obj=new Pattern5();
		obj.method(n);
	}
	void method(int n)
	{
		int i=0,j=0;
		for (i=1;i<=n;i++)
		{
			for (j=i;j<n;j++)			
				System.out.print(" ");
	        for (j=1;j<=(2*i-1);j++)
	        {
	        	if(i==n || j==1 || j==(2*i-1))
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
	
	}
}
