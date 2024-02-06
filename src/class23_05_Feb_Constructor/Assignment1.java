
/*
 * Write a java program to create a classs "person" with a name and age attribute.
 * create a two instances of the " Person" class set their attributes using the constructor
 *  and print their name and age
 * 
 */
package class23_05_Feb_Constructor;

class PersonA1 {
	String name;
	int age;

	// Constructor to initialize the name and age attributes
	PersonA1(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class Assignment1 {
	public static void main(String[] args) {
		// Create two instances of the Person class using the constructor
		PersonA1 person1 = new PersonA1("Alice", 25);
		PersonA1 person2 = new PersonA1("Bob", 30);

		// Print the name and age of the first person
		System.out.println("Person 1 - Name: " + person1.name + ", Age: " + person1.age);

		// Print the name and age of the second person
		System.out.println("Person 2 - Name: " + person2.name + ", Age: " + person2.age);
	}
}
