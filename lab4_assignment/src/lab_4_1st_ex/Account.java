package lab_4_1st_ex;
import java.util.concurrent.ThreadLocalRandom;
public class Account {

	long accNum;
	double balance;
	Person accHolder;
	
	
	
	public void deposit(double amount) {
		
		balance += amount;
		System.out.println("Amount Deposited. New Balance = "+balance);
	}
	
	public void withdraw(double amount) {
		 if(amount>balance) {
			System.out.println("Insufficient funds");
		}
		else {
			balance -= amount;
			System.out.println("Amount withdrawn. New balance = "+balance);
		}
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum() {
		accNum = ThreadLocalRandom.current().nextLong();
		
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double blc) {
		if(blc<500) {
			System.out.println("Minimum balance 500 or more required\n Enter again");
		}
		else {
		balance = blc;}
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person person) {
		accHolder = person;
	}
	
	
}
