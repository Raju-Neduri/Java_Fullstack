package class24_06_Feb_ConstructorChaining;

public class Methodcalling {

	public void m1() {
		System.out.println("inside the method");

	}

	public void m2() {
		System.out.println("inside the m2 method");
	}

	public static void main(String[] args) {
		Methodcalling m = new Methodcalling();
		m.m2();

	}

}
