package class29_12_Feb_Abstraction;

abstract class Junglee {
	String name = "zoo";

	abstract void running();

	void eating() {
		System.out.println("eating .....");
	}
}

class Tiger extends Junglee {
	void running() {
		System.out.println("Tiger is running...");
	}
}

public class Animal {

	public static void main(String[] args) {

		Tiger t = new Tiger();
		t.running();
		t.eating();

	}

}
