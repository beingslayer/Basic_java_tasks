package lab1_assignment;

import java.util.Scanner;

public class DifferenceSquareSum{

static int Square_Diff(int n){
	int sum=0,numbersum=0,diff;
	for (int i=0;i<=n;i++){
		sum=sum+(i*i);
		numbersum=numbersum+i;
	}
	diff=sum-(numbersum*numbersum);
	return diff;

}


public static void main(String s[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	System.out.println(Square_Diff(n));	
	
}
}