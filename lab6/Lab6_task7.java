package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab6_task7 {
public static void main(String[] args) {
	int[] num= {25,17,23,12,10};
	int[] num2=getSorted(num);
	for(int n:num2)
	System.out.println(n);
}
public static int[] getSorted(int arr[]) {
	
	  
	List<String> mylist=new ArrayList<String>();
	for(int n:arr) {
		StringBuilder num=new StringBuilder();
		num.append(n);
	 num.reverse();  
	 mylist.add(num.toString());
	}
	Collections.sort(mylist);
	int[] reverse = new int[mylist.size()];
	for(int i=0;i<mylist.size();i++) {
		reverse[i]=Integer.parseInt(mylist.get(i)) ;
	}
return reverse;
}
}