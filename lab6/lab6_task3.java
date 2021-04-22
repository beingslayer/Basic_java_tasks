package lab6;

import java.util.HashMap;
import java.util.Map;

public class lab6_task3 {
public static void main(String[] args) {
	int[] num= {1,3,4,6,2,7,8};
	System.out.println(getSquares(num));
}
private static Map<Integer, Long> getSquares(int[] n) {
	Map<Integer, Long> mymap=new HashMap<Integer, Long>();
	for(int a:n) {
		long sqr=a*a;
		mymap.put(a, sqr);
	}
	return mymap;
}
}