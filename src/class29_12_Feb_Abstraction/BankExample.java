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

class Axis extends Bank {
	void getRateOfInterest() {
		System.out.println("The rate of interest is 8% PA");
	}
}

class SBI extends Bank {
	void getRateOfInterest() {
		System.out.println("The rate of interest is 9% PA");
	}
}

public class BankExample {

	public static void main(String[] args) {
		Axis m = new Axis();
		SBI s = new SBI();
		m.show();
		m.getRateOfInterest();
		s.show();
		s.getRateOfInterest();

	}

}
