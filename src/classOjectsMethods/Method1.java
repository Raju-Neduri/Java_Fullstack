package classOjectsMethods;

public class Method1 {
	void example() { // instance method
		System.out.println("This is  instance method in the class");

	}

	static void example2() { // Static method
		System.out.println("This is static method in the class");
	}

	public static void main(String[] args) {
		Method1 m = new Method1();// instance method is called by object level instance
		m.example();

		Method1.example2();// static method is called by class level

		System.out.println("This is main method in the class");
	}

}
