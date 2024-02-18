package class30_13_Feb;

abstract class BankAccount {

	double balance;

	public void amount(double balance) {
		this.balance = balance;
	}

	public double remaining() {
		return balance;
	}

	abstract void deposit(double amount);

	abstract void withdraw(double amount);

}

class SavingsAccount extends BankAccount {
	// Removed unnecessary variable 'deposit'

	public void savingbalance(double balance) {
		super.balance = balance;
	}

	@Override
	public void deposit(double deposit) {
		balance = deposit + balance;
	}

	@Override
	public void withdraw(double withdraw) {
		balance = balance - withdraw;
	}
}

class CurrentAccount extends BankAccount {

	@Override
	void deposit(double amount) {
		System.out.println("Amount deposited in Current");
		balance += amount;
	}

	@Override
	void withdraw(double amount) {
		System.out.println("Amount withdrawn from Current");
		balance -= amount;
	}
}

public class BankQuestion {

	public static void main(String[] args) {

		CurrentAccount c = new CurrentAccount();
		c.amount(1000);
		c.deposit(500);
		System.out.println("Remaining balance: " + c.remaining());

		c.withdraw(200);
		System.out.println("Remaining balance: " + c.remaining());
	}
}
