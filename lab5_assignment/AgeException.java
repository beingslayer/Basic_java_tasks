package lab5_assignment;

public class AgeException extends Exception {
	private String excMsg = "";

	public AgeException() {
		super();
	}

	public AgeException(String message) {
		super(message);
		this.excMsg = message;
	}

	@Override
	public String toString() {
		return "Age Exception :- "+excMsg;
	}
}