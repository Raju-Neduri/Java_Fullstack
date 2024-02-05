//Question 2: Object Instantiation
//
//Instantiate an object of the Person class and set the name to "Alice" and age to 25.
//Use the introduce method to print the person's introduction.
package classOjectsMethods;

class Person1 {
	String name;
	int age;

	void introduce() {
		System.out.println("Hello " + name + ", welcome! Your age is: " + age);
	}
}

public class Question2 {
	public static void main(String[] args) {
		// Instantiate an object of the Person class
		Person1 person = new Person1();

		// Set the name and age
		person.name = "Alice";
		person.age = 25;

		// Use the introduce method to print the person's introduction
		person.introduce();
	}
}
