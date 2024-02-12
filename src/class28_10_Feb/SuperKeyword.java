package class28_10_Feb;

class A {
	public void show() {
		System.out.println("Inside the parent class");
	}
}

class B extends A {
	public void show() {
		super.show();
		System.out.println("inside the child class");

	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		B b = new B();
		b.show();

	}

}
