package class29_12_Feb_;

class Parent {
	final int x = 100;

	public double value() {
		double d = 987.00;
		return d;

	}

}

class Child extends Parent {

	int y = 200;

	public void show() {
		System.out.println(x);

	}
}

public class FinalKeyword {

	public static void main(String[] args) {

		Child c = new Child();
		c.show();
	}
}
