package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab6_task5 {
	public static void main(String[] args) {
		int[] number = { 10, 25, 84, 54, 10, 2, 26, 98, 75 };
		System.out.println(getSecondSmallest(number));
	}

	public static int getSecondSmallest(int[] num) {
		List<Integer> mylist = new ArrayList<Integer>();
		for (int n : num) {
			mylist.add(n);
		}
		Collections.sort(mylist);
		return mylist.get(mylist.size() - 2);
	}

}