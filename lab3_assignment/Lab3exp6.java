package lab3;
import java.util.Scanner;

public class Lab3exp6 {

	public static boolean isPositive(String str) {
		
		char letters[] = str.toCharArray();
		
		for(int i=1;i<letters.length;i++) {
			
			if(   (   (int)   letters[i-1]   )  > ((int)letters[i])   ) {
				return false;
			}
			
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter word : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.toUpperCase();
		if(isPositive(input)) {
			System.out.println("\nPositive String");
		}
		else
			System.out.println("\nNegative String");
	}
}