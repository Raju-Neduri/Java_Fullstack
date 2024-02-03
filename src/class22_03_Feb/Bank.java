//3. Write a java program to create a class called "Bank" with a collection of accounts, 
//and method to add a remove accounts and to deposit and withdraw money.

package class22_03_Feb;

class Bank1 {
	int acc;
	String name;
	int amount;

	void details(int acc, String name, int amount) {
		this.acc = acc;
		this.name = name;
		this.amount = amount;
	}

	void show() {
		System.out.println("Account no: " + acc + ", Name: " + name + ", Amount: " + amount);
	}

	void deposit(int a) {
		amount += a;
		System.out.println("Deposit amount: " + a);
	}

	void withdraw(int a) {
		if (amount < a) {
			System.out.println("Insufficient Balance");
		} else {
			amount -= a;
			System.out.println("Withdrawn amount: " + a);
		}
	}

	void checkbalance() {
		System.out.println("Balance amount is: " + amount);
	}
}

public class Bank {
	public static void main(String[] args) {
		Bank1 b = new Bank1();
		b.details(1028383, "Raju", 20000);
		b.show();
		b.deposit(1000);
		b.checkbalance();
		b.withdraw(2000);
		b.checkbalance();
	}
}
