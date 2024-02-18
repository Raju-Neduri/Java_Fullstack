package class30_13_Feb;

class Parent {
	public void getData() {
		System.out.println("Parent's data");
	}
}

class Child extends Parent {
	public void show() {
		System.out.println("Child's show");
	}
}

public class UpcastingEX {

	public static void main(String[] args) {
		// Upcasting: Creating an instance of Child and assigning it to a Parent
		// reference
		Parent ob1 = new Child();
		ob1.getData();

		// Casting is not needed in the above line, but if you want to call a method
		// specific to Child, you can cast like this:
		((Child) ob1).show();
	}
}
