package day7.task1;

public class MainExecution {
public static void main(String[] args) {
EmployeeService service = new EmployeeService();

String codes[] = service.getEmployeeCodes();
String city;
for (String empid : codes) {
city=service.getcity(empid);
System.out.println(empid+":"+city);
}

}//end main
}//end class
//Perform the following operation
// Question 1

//Following is the new requirement from Client
// Print employee id with their respective job location
// for example
// 101 : Delhi
// 102 : Mumbai
// and so on