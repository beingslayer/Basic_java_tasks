package lab1_assignment;

import java.util.Scanner;
public class PowerofTwo{

	  public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter a Number?");
	    int n = in.nextInt();
	    in.close();

	    if (isPowerOfTwo(n)) {
	      System.out.println("yes");
	    } else {
	      System.out.printf("no");
	    }
	  }

	  private static boolean isPowerOfTwo(int num) {

	    if (num % 2 != 0) {
	      return false;
	    } else {

	      for (int i = 0; i <= num; i++) {

	        if (Math.pow(2, i) == num) return true;
	      }
	    }
	    return false;
	  }
	}