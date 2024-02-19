package class34_19_Feb;

interface Animal {
	void showType();

	interface Pets {
		void showPrice();

	}
}

class Demo implements Animal.Pets {
	public void showPrice() {
		System.out.println("Hello, This method is for nested interface");
	}
}

public class NestedInterface {

	public static void main(String[] args) {
		Animal.Pets p = new Demo();
		p.showPrice();

	}

}
