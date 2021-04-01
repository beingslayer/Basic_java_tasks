package lab2_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestElement {

	public static void findSecondSmallest(int[] arr) {
		 
		 
	        Arrays.sort(arr);
	 
	        System.out.println("The 2nd Smallest number is :"+arr[1]);
	        
	}
	
	public static void main(String[] args) {
	 
		
	 System.out.println("Enter the array size");
	 Scanner sc = new Scanner(System.in);
	 int size=sc.nextInt();
	 int array[]= new int[size];
	 System.out.println("Enter the values");
	 
	 for(int i=0;i<size;i++) {
		 array[i]=sc.nextInt();
	 }
	 
	 findSecondSmallest(array);
	}
	
}