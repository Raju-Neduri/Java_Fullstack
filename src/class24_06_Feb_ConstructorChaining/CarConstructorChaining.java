/*
 Question: Handling Circular Constructor Chaining
Implement a class Car with attributes make, model, and year. 
Create three constructors: a default constructor, a constructor with make, 
and a constructor with make, model, and year. Be cautious not to introduce circular constructor chaining.
 */

package class24_06_Feb_ConstructorChaining;

class Car {
	String make;
	String model;
	int year;

	// Default constructor
	public Car() {
		// Default values or leave them uninitialized
	}

	// Constructor with make
	public Car(String make) {
		this(make, "Unknown", 0);
	}

	// Constructor with make, model, and year
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	// Display details
	public void displayDetails() {
		System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
	}
}

public class CarConstructorChaining {
	public static void main(String[] args) {
		// Test the Car class
		Car car1 = new Car();
		Car car2 = new Car("Toyota");
		Car car3 = new Car("Honda", "Accord", 2022);

		// Display details
		car1.displayDetails();
		car2.displayDetails();
		car3.displayDetails();
	}
}
