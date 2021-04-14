package pl_main;
import service.*;

public class EmployeeMain {
public static void main(String[] args) {
	
	System.out.println("Please enter with necessary details :");
	EmployeeService es = new EmployeeService();
	es.getInfoFromUser();
	es.findScheme();
	es.displayUserInfo();
}
	
}
