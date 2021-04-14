package lab_4_1st_ex;

public class currentAccount extends Account{

	final float odLimit = 200000;
	
	public void withdraw(double amount) {
		if(amount>odLimit) {
			System.out.println("Overdraft Limit exceeded");
		}
		else {
			balance -= amount;
			
			System.out.println("Amount withdrawn. New balance = "+balance);
		}
	}
}
