package lab9;

import java.util.Scanner;
import java.util.function.BiFunction;

public class lab9First {
	public static void main(String[] args) {
		System.out.println("Enter number and power values:");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		BiFunction<Integer, Integer, Double> power = (a, b) -> Math.pow(a, b);
		System.out.println(power.apply(x, y));
	}
}

