/*
 * Basic Inheritance:
Write a Java program to create a base class called Vehicle with attributes like make, 
model, and a method displayDetails() to print out these details. 
Create a derived class called Car that inherits from Vehicle and 
adds a new attribute numDoors. Override the displayDetails() method in the Car class to 
include the number of doors.
 */

package class26_08_feb_inheritance;

class Vechile {
	private String make;
	private String model;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void show() {
		System.out.println("Make:" + make);
		System.out.println("Model:" + model);
	}

	class Car extends Vechile {
		int numDoors;

		public Car(String make, String model, int numDoors) {
		}
	}

}

public class Inheritance {

	public static void main(String[] args) {
		// Create an instance of Car

		// Call displayDetails() to print car details
	}
}
