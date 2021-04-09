package day3;

import java.util.Scanner;

public class BankApp {
	private static int amount, balance;
	private static String acc_status;

	public static void main(String[] args) {

		/*
		 * business use case ------------------- if balance is less than 10,000 :-
		 * account holder cannot withdrawal in such case account status should be
		 * inactive.
		 * 
		 */

		BankAccount bank_acc = new BankAccount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your option\n \t 1. Withdraw \t 2. Deposit");
		int option = sc.nextInt();
		if (option == 1) {
			System.out.print("Enter the withdraw amount:-");
			amount = sc.nextInt();
			if (amount > bank_acc.getBalance()) {
				System.out.println("You dont have enough funds");
			} else {
				balance = bank_acc.doWithdrawal(amount);
			}
		} else if (option == 2) {
			System.out.print("Enter the deposit amount:-");
			amount = sc.nextInt();
			balance = bank_acc.doDeposit(amount);
		} else {
			System.out.println("INVALID INPUT");
		}
		if (option == 1 || option == 2) {
			String acc_holderName = bank_acc.getAccountHolderName();
			Boolean isStatus = bank_acc.isStatus();
			if (isStatus == true) {
				acc_status = "Active";
			} else {
				acc_status = "Inactive";
			}
			System.out.println("************ACCOUNT INFORMATION************");
			System.out.println(
					"\tAccount Holder Name:" + acc_holderName + "\n\tBalance:" + balance + "\n\tStatus:" + acc_status);

		}

	}
}