package day3_Assignment_has_a;

public class Account {

	private int accountNumber;
	private String accountHolderName;
	private int balance;
	
	private Policy policies[] = new Policy[3];// collections
	
	

	public Account(int accountNumber, String accountHolderName, int balance, Policy[] policies) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.policies = policies;
	}
	

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(int accountNumber, String accountHolderName, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		
	
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public Policy[] getPolicies() {
		return policies;
	}


	public void setPolicies(Policy[] policies) {
		this.policies = policies;
	}
	
	public void display() {
		System.out.println("\nAccount Number : "+accountNumber+"\nAccount Holder Name : "+accountHolderName+"\nBalance : "+balance);
	}
	
	
}