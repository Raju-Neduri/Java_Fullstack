package class27_09_feb_Hierarchical;

class Car {
	public void print() {
		System.out.println("The price of the base car is 200000");

	}

}

class Car2 extends Car {
	public void print2() {
		System.out.println("The price of the second car is 300000");
	}
}

class Car3 extends Car2 {
	public void print3() {
		System.out.println("The price of the Third car is 300000");
	}
}

public class CarMultiLevel {

	public static void main(String[] args) {
		Car3 c = new Car3();
		c.print();
		c.print2();
		c.print3();
	}

}
