package lab5_assignment;

public class NameException extends Exception {
	private String excMsg = "";

	public NameException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NameException(String message) {
		super(message);
		this.excMsg = message;
	}

	@Override
	public String toString() {
		return "Name Exception :- "+excMsg;
	}
}
