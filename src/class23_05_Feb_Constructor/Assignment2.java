/* write a java program to create a class  "vehicle" with model no,name, price,
 * Create a instance  of the  same class and show the details
 * 
 * 
 */

package class23_05_Feb_Constructor;

class Vehicle {
	int modelNo;
	String name;
	int price;

	public Vehicle(int modelNo, String name, int price) {
		this.modelNo = modelNo;
		this.name = name;
		this.price = price;
	}

	public void show() {
		System.out.println("Model No: " + modelNo);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
	}

}

public class Assignment2 {

	public static void main(String[] args) {
		Vehicle v = new Vehicle(5440, "Tar", 6000000);
		v.show();

	}

}
