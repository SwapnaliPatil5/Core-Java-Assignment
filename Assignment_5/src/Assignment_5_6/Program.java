package Assignment_5_6;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.UUID;

class BankAccount {
	String accountHolderName;
	int AccountNumber;
	double AccountBalance;

	public BankAccount() {

	}

	Scanner sc = new Scanner(System.in);

	public void createAccount() {
		// Scanner sc = new Scanner(System.in);
		System.out.print("Enter account holder's name		:	");
		this.accountHolderName = sc.next();
		System.out.println(" account holder's name		:	" + accountHolderName);

		// UUID uniqueNumber = UUID.randomUUID();
		// System.out.println("Unique Number: " + uniqueNumber.toString());

		SecureRandom random = new SecureRandom();
		this.AccountNumber = random.nextInt();
		System.out.println(" Account Number		:	" + this.AccountNumber);

		this.AccountBalance = 0;
	}

	public void depositMoney() {
		System.out.print("Enter account Number		:	");
		int givenAccountNumber = sc.nextInt();

		if (givenAccountNumber == this.AccountNumber) {
			System.out.print("Enter the amount		:	");
			double amount = sc.nextDouble();
			AccountBalance = AccountBalance + amount;
			System.out.println("	Your Account Balance is		:	" + AccountBalance+ " Rs");
		} else {
			System.out.println("account number is not valid");

		}

	}

	public void withdrawMoney() {
		System.out.print("Enter account Number		:	");
		int givenAccountNumber = sc.nextInt();

		if (givenAccountNumber == this.AccountNumber) {
			System.out.print("Enter the amount		:	");
			double amount = sc.nextDouble();
			if (amount <= AccountBalance) {
				AccountBalance = AccountBalance - amount;
				System.out.println("	Your Account Balance is		:	" + AccountBalance+ " Rs");
			} else {
				System.out.println("	Insufficinet Balance  ");
			}
		} else {
			System.out.println("account number is not valid");

		}

	}

	public void displayBalance() {
		System.out.print("Enter account Number		:	");
		int givenAccountNumber = sc.nextInt();

		if (givenAccountNumber == this.AccountNumber) {
			System.out.println("	Your Account Balance is		:	" + AccountBalance+ " Rs");
		} else {
			System.out.println("account number is not valid");

		}
	}

	public void displayInfo() {
		System.out.print("Enter account Number		:	");
		int givenAccountNumber = sc.nextInt();

		if (givenAccountNumber == this.AccountNumber) {
			System.out.println("	Account Holder Name		:	" + accountHolderName);
			System.out.println("	Your Account Balance is		:	" + AccountBalance+ " Rs");
			
		} else {
			System.out.println("account number is not valid");

		}
	}		
	}


public class Program {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.createAccount();
		// account.depositMoney();
		// account.depositMoney();
		// account.withdrawMoney();
		//account.displayBalance();
		account.displayInfo();
		

	}

}
