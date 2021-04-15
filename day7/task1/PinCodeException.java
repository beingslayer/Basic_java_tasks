package day7.task1;

public class PinCodeException extends Exception{
	
	private String excMsg = "";

	public PinCodeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PinCodeException(String message) {
		super(message);
		this.excMsg = message;
	}

	@Override
	public String toString() {
		return "PinCodeException :- "+excMsg;
	}
	


}