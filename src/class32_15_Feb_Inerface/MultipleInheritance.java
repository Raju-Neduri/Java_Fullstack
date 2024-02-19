package class32_15_Feb_Inerface;

interface A {
	public void display();
}

interface B {
	public void display();
}

class Test implements A, B {
	public void display() {
		System.out.println("Inside the test class to show multiple inheritance");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Test t = new Test();
		t.display();

	}

}
