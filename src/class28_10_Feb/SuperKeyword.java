/*
 * The super keyword refers to superclass (parent) objects.

It is used to call superclass methods, and to access the superclass constructor.

The most common use of the super keyword is to eliminate the confusion between 
super classes and subclasses that have methods with the same name.
 */
package class28_10_Feb;

class A {
	int id = 100;
	String n = "Raj";

	public void show() {
		System.out.println("Inside the parent class");
	}
}

class B extends A {
	int id = 200;
	String n = "Ram";

	public void show() {
		super.show();
		System.out.println("inside the child class");

	}

	public void display() {
		System.out.println("child ID:" + id + ", Parent class ID:" + super.id);
		System.out.println("child String:" + n + " , Parent class name:" + super.n);

	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		B b = new B();
		b.show();
		b.display();

	}

}
