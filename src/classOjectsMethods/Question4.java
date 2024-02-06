/*
Question 4: Class Composition

Create a class named Address with attributes street and city. 
Modify the Person class to include an additional attribute address of type Address. 
Update the introduce method to also display the person's address.
*/

package classOjectsMethods;

class Address {
	String street;
	String city;

	public Address(String street, String city) {
		this.street = street;
		this.city = city;
	}

	public String getAddressInfo() {
		return street + ", " + city;
	}
}

class Person4 {
	String name;
	int age;
	Address address;

	public Person4(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	void introduce() {
		System.out.println("Hello, my name is " + name + ", and I am " + age + " years old.");
		System.out.println("I live at: " + address.getAddressInfo());
	}
}

public class Question4 {
	public static void main(String[] args) {
		Address personAddress = new Address("123 Main St", "Cityville");

		Person4 person = new Person4("Bob", 30, personAddress);

		// Use the introduce method to print the person's introduction with address
		person.introduce();
	}
}
