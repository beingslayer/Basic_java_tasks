package day7.task1;
public class EmployeeService {
	private String employees[] ={"101001011","102001022","103002011","104003080","105002020","106002080"};
	/*
* Note : employee codes are designed in following way:
* a) first 3 digits are employee code
* b) next 3 digits are related to their department id.
* c) and last 3 digits are the city code of their work location
* for example
* 011 : Delhi
* 022 : Mumbai
* 080 : Banglore
* 020 : Pune
* */
	public String[] getEmployeeCodes()
	{
				String codes[] = new String[employees.length];
				int count = -1;
				for (String empid : employees) {
					
					codes[++count] = empid.substring(0, 3);
				}
				return codes;
	}
	public String getcity(String empid) {
		String cityname=null;
		for (int i=0;i<employees.length;i++) {
			if(employees[i].startsWith(empid)&&employees[i].endsWith("011")) {
				cityname= "Delhi";
				
			}
			else if(employees[i].startsWith(empid)&&employees[i].endsWith("022")) {
				cityname= "Mumbai";
				
			} 
			else if(employees[i].startsWith(empid)&&employees[i].endsWith("080")) {
				cityname= "Bangalore";	
			}
			
			else if(employees[i].startsWith(empid)&&employees[i].endsWith("020")) {
				cityname= "Pune";	
			}
			
		}
				
		return cityname;
	}
	public void checkcity(String Empserviceno) throws PinCodeException {
		// TODO Auto-generated method stub
			
			if(Empserviceno.endsWith("011")) {
				
				System.out.println("City is Delhi");
			}
			else if(Empserviceno.endsWith("022")) {
				System.out.println("City is Mumbai");
				
			} 
			else if(Empserviceno.endsWith("080")) {
				System.out.println("City is Bangalore");
			}
			
			else if(Empserviceno.endsWith("020")) {
				System.out.println("City is Pune");
			}
			else {
				throw new PinCodeException("Wrong Pin Code of "+Empserviceno);
			}
			
	}
	}//end employee service class