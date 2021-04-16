package lab5_assignment;

public class EmployeeException extends Exception {
	String salary;

	public EmployeeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeException(String salary) {
		super(salary);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeException " + salary;

}
}