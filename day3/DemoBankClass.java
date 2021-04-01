package day3;

public class DemoBankClass {
	
	int accnum,balance,debit_amount,credit_amount,deposit,withdraw;
	String accholdername;
	
	public void getbank_customerinfo()
	{
		System.out.println(accholdername+":"+accnum);
	}
	public void getbalance() {
		System.out.println(balance);
	}
	public void getDebitinfo() {
		System.out.println("Total Debit Amount:"+debit_amount);
		
	}
	public void getCreditinfo() {
		System.out.println("Total Credit amount:"+credit_amount);
	}

	public int updatedepositBalance() {
		balance=balance+deposit;
		return balance;
		
	}
	public int updatewithdrawBalance() {
		balance=balance-withdraw;
		return balance;
	}
}
