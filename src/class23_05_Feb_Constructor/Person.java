package class23_05_Feb_Constructor;

public class Person {
	int id;
	String name;

	Person() {
		System.out.println("Inside the default constructor");
	}

	Person(int x) {
		System.out.println("Inside  parameterized constructor: Value of x:" + x);
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person(100);
		System.out.println("Printing using default constructor:" + p1.id + p1.name);
		System.out.println("Printing using Parameterized constructor:" + p2.id + p2.name);
	}

}
