package lab1_assignment;
import java.util.Scanner;
public class DivisiblebyN {
	
	
	static int calculatesum(int N, int X, int Y)
	{
		int sum=0;
		for (int i=0;i<=N;i++){
			if(i%3==0||i%5==0) {
				sum=sum+i;
			}
			
		}
		return sum;
	}
	
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int N=sc.nextInt();
		int X = 3, Y = 5;
	
		System.out.println(calculatesum(N, X, Y));
	
	}
}
