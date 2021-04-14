package lab_4_1st_ex;

public class savingsAccount extends Account {
	
	final float minBalance = 500;
	
	public void withdraw(double amount) {
		if((balance-amount)<500) {
			System.out.println("Cannot withdraw. Minimum maintaining balance required");
		}
		else if(amount>balance) {
			System.out.println("Insufficient funds");
		}
		else {
			balance -= amount;
			System.out.println("Amount withdrawn. New balance = "+balance);
		}
	}

}
