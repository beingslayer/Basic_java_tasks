package day7.task1;

public class CustomException {

	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeService();
		
		try
		{
			
			service.checkcity("101001011");
			service.checkcity("101001091");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		
	}
}