package lab1_assignment;

import java.util.Scanner;

public class Prime_num {
	public static void main(String[] args)
	{
		int a,b;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		b = s.nextInt();
		System.out.println("The prime number upto "+b);
		for(int i=2; i<b; i++)
		{
			a=0;
			for(int j=2; j<i; j++)
			{
				if(i%j ==0)
				a=1;
			}
			
			if(a==0)
				
				System.out.print(i+"\t");
		}
	}
}
