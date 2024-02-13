/*
 * Write a program to create a abstract class called Bank which contains abstract method 
 * getRateOfinterest() and override this method in child class Bank class 
 * contains one non-abstract method show()
 */

package class29_12_Feb_Abstraction;

abstract class Bank {

	abstract void getRateOfInterest();

	void show() {
		System.out.println("This is the Bank class.");
	}

}

class MyBank extends Bank {
	void getRateOfInterest() {
		System.out.println("The rate of interest is 8% PA");
	}
}

public class BankExample {

	public static void main(String[] args) {
		MyBank m = new MyBank();
		m.show();

		m.getRateOfInterest();

	}

}
