package classs30_13_Feb;

abstract class BankAccount {

	double balance;

	public void amount(double balance) {
		this.balance = balance;
	}

	public double remaining() {
		return balance;
	}

	abstract void deposit();

	abstract void withdraw();

}

class SavingsAccount extends BankAccount {
	double deposit

	public void savingbalance(double balance) {
		super.balance = balance;
	}

	public void deposit(double deposit) {
		balance = deposit + balance;
	}

	public void withdraw(double withdraw) {
		balance = balance - withdraw;
	}
}

class CurrentAccount extends BankAccount {

	void deposit() {
		System.out.println("Amount deposited in Current");
	}

	void withdraw() {
		System.out.println("amount whithdraw from Current");
	}
}

public class BankQuestion {

	public static void main(String[] args) {
		
		CurrentAccount  c= C

	}

}
