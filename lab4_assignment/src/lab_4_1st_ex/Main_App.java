package lab_4_1st_ex;

public class Main_App {

	public static void main(String[] args) {
		
		Person smith = new Person();
		Person kathy = new Person();
		
		smith.setAge((float) 24.5);
		smith.setName("Smith");
		
		kathy.setAge((float) 33.5);
		kathy.setName("Kathy");
		
		Account acc = new Account();
		acc.setAccHolder(kathy);
		acc.setAccNum();
		acc.setBalance(100000);
	
		System.out.println(acc.getAccHolder().getAge()+"\n"+acc.getAccHolder().getName()+"\n"+acc.getAccNum());
		acc.withdraw(2000);
		
		acc.setAccHolder(smith);
		acc.setAccNum();
		acc.setBalance(2000);
		

		System.out.println(acc.getAccHolder().getAge()+"\n"+acc.getAccHolder().getName()+"\n"+acc.getAccNum());
		acc.deposit(2000);
		
		
	}
}
