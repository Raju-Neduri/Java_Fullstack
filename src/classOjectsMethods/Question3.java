/*
Question 3: Adding a Method

Add a method have_birthday to the Person class that increments the age by 1. 
Instantiate a person object, call the have_birthday method, and 
then use the introduce method to print the updated information.

*/

package classOjectsMethods;

class Person3 {

	String name = "Raju";
	int age = 24;

	void have_birthday() {
		age++;

	}

	public void introduce() {
		System.out.println("Hello " + name + ", welcome! Your age is: " + age);
	}

}

public class Question3 {

	public static void main(String[] args) {
		Person3 p = new Person3();
		p.have_birthday();
		p.introduce();

	}

}
