/*write a java program to create a class  "vehicle" with model no,name, price,
 * Create a instance  of the  same class. set their attributes  using the constructor and 
 * modify  the attributes  using the setter  method and print the updated values
 * 
 */
package class23_05_Feb_Constructor;

class Vehicle1 {
	int modelNo;
	String name;
	int price;

	// Constructor to initialize the attributes
	public Vehicle1(int modelNo, String name, int price) {
		this.modelNo = modelNo;
		this.name = name;
		this.price = price;
	}

	// Setter methods to modify attributes
	public void setModelnNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setprice(int price) {
		this.price = price;
	}

	// show method
	public void show() {
		System.out.println("Model No: " + modelNo);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
	}

}

public class Assignment3 {

	public static void main(String[] args) {
		Vehicle1 v = new Vehicle1(5440, "Tar", 6000000);
		v.show();

		v.setModelnNo(1000);
		v.setName("Carx");
		v.setprice(8000000);

		System.out.println("\nThis is the updated values");
		v.show();

	}

}
