package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class lab6_task1 {
	public static void main(String[] args) {
		HashMap<Integer, String> mymap = new HashMap<Integer, String>();
		mymap.put(1001, "GAURAV");
		mymap.put(1002, "ROHIT");
		mymap.put(1003, "Shyam");
		mymap.put(1004, "Rajni");
		mymap.put(1005, "Ramiko");
		mymap.put(1006, "Shinchan");
		List<String> mylist = new ArrayList<String>();
		mylist.addAll(getValues(mymap));
		System.out.println(mylist);
	}

	public static List<String> getValues(HashMap<Integer, String> m) {
		List<String> l = new ArrayList<String>();
		// .values()
		l.addAll(m.values());
		Collections.sort(l);
		return l;
	}

}