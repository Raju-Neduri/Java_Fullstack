package class28_10_Feb;

class A {
	int id = 100;

	public void show() {
		System.out.println("Inside the parent class");
	}
}

class B extends A {
	int id = 200;

	public void show() {
		super.show();
		System.out.println("inside the child class");

	}

	public void display() {
		System.out.println("child ID:" + id + ", Parent class ID:" + super.id);

	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		B b = new B();
		b.show();
		b.display();

	}

}
