package lab3;

import java.util.Scanner;

public class modifyNumber {
	public static void main(String[] args) {
		String res="";
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		char numbers[] =number.toCharArray();
		
		for(int i=1;i<numbers.length;i++) {
			int temp =Math.abs( ((int)  numbers[i])-((int)numbers[i-1])); 
			res+=(Integer.toString(temp));
		}
			System.out.print(res+numbers[numbers.length-1]);
		
	}
}
