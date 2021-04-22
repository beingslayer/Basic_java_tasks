package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map.Entry;

public class Lab6_task6 {
	public static void main(String[] args) {
		HashMap<String, Integer> person =new HashMap<String, Integer>();
		person .put("Cap1001", 40);
		person .put("Cap1002", 20);
		person .put("Cap1003", 15);
		person .put("Cap1004", 17);
		person .put("Cap1005", 55);
		System.out.println(getStudents(person));
	}

	public static List<String> getStudents(HashMap<String, Integer> v) {
		List<String>voters=new ArrayList<String>();
		
		for (Entry<String, Integer> iterable_element : v.entrySet()) {
			if(iterable_element.getValue() >= 18) {
			voters.add(iterable_element.getKey());		
			}
		}
		
		return voters;
	}
}