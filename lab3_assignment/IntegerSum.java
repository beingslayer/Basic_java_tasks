package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IntegerSum {
		public static void main(String[] args) {
			int sum=0,num=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the integers in the same line");
			String str=sc.nextLine();
			StringTokenizer st=new StringTokenizer(str);
			System.out.println("The numbers are:");
			while(st.hasMoreTokens()) {
				num=Integer.parseInt(st.nextToken());
				sum=sum+num;
				System.out.println("\t\t"+num);
				
			}
			System.out.println("Total Sum is:-"+sum);
			
		}
}
