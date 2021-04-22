package lab6;

import java.util.HashMap;
import java.util.Map;

public class lab6_task2 {
	public static void main(String[] args) {
		char arr[] = { 'A', 'C', 'A', 'B', 'C', 'A' };
		System.out.println(countChars(arr));
	}

	public static Map<Character, Integer> countChars(char[] arr) {
		HashMap<Character, Integer> mymap = new HashMap<Character, Integer>();

		for (int y = 0; y < arr.length; y++) {
			if (mymap.containsKey(arr[y])) {
				int currCount = mymap.get(arr[y]);
				currCount++;
				mymap.put(arr[y], currCount);
			} else {
				mymap.put(arr[y], 1);
			}
		}
		return mymap;
	}
}