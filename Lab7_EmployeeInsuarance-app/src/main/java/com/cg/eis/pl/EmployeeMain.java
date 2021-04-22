package com.cg.eis.pl;
import java.util.*;
import java.util.Map.Entry;

import com.cg.eis.bean.*;
import com.cg.eis.service.*;
public class EmployeeMain {
public static void main(String[] args) {
	
	System.out.println("How many employees are there? :");
	Scanner sc = new Scanner(System.in);
	int flag=0;
	int num = sc.nextInt();
	
	
	HashMap<String,EmployeeService> map=new HashMap<String,EmployeeService>();
	EmployeeService[] es = new EmployeeService[num];
	
	for(int i=0;i<num;i++) {
		
			System.out.println("Please enter with necessary details :");
			
			
			es[i] = new EmployeeService();
			
			es[i].getInfoFromUser();
			es[i].findScheme();
			//es.displayUserInfo();
			
			map.put(es[i].getE().getInsuranceScheme(), es[i]);
			System.out.println(es[i].getE().getInsuranceScheme());
			
			
			
	}
	
	System.out.println("Enter Insuarance scheme to print the details : ");
	Scanner s = new Scanner(System.in);
	String insuarance = s.nextLine();
	map.get(insuarance.toLowerCase()).displayUserInfo();
	
	System.out.println("Displaying Complete map: ");
	promptEnterKey();
	
	for (Map.Entry<String, EmployeeService> entry : map.entrySet()) {
	    System.out.println("\n"+entry.getKey() );
	    entry.getValue().displayUserInfo();
	}
	
	
	System.out.println("To delete items press enter : ");
	promptEnterKey();
	
	System.out.println("Enter id to delete :");
	int id = s.nextInt();
	
	for (Map.Entry<String, EmployeeService> entry : map.entrySet()) {
	    if(entry.getValue().getE().getId()==id) {
	    	System.out.println("\n"+entry.getKey() );
		    entry.getValue().displayUserInfo();
		    System.out.println("This record has been deleted");
		    map.remove(entry.getValue().getE().getInsuranceScheme());
		    flag =1;
		    break;
	    }
	   
	}
	if(flag==0) {
		 
		    	System.out.println("Record Not found");	
	}
	
	System.out.println("Displaying new map :");
promptEnterKey();
	
	for (Map.Entry<String, EmployeeService> entry : map.entrySet()) {
	    System.out.println("\n"+entry.getKey() );
	    entry.getValue().displayUserInfo();
	}
	
	
	
}
public static void promptEnterKey(){
	   System.out.println("Press \"ENTER\" to continue...");
	   Scanner scanner = new Scanner(System.in);
	   scanner.nextLine();
	}
	
}
