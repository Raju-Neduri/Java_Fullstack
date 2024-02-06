/*
 * Create a class Person with attributes name, age, and address.
 *  Implement constructor overloading with different parameter signatures: 
 *  a default constructor, a constructor with name and age, 
 *  and a constructor with name, age, and address.
 */
package class24_06_Feb_ConstructorChaining;

class Person {
	String name;
	int age;
	String address;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void printDetails() {
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("Address: " + this.address);
		System.out.println("");
	}

}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Person p = new Person();
		Person p1 = new Person("Surya", 25);
		Person p2 = new Person("Chintu", 30, "Karimnagar");

		p.printDetails();
		p1.printDetails();
		p2.printDetails();

	}

}
