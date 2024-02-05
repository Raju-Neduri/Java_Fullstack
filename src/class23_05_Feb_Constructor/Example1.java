package class23_05_Feb_Constructor;

public class Example1 {

	int id;
	String name;

	public Example1() {
		System.out.println("Default contructor");

	}

	public static void main(String[] args) {
		System.out.println("Inside the main method");
		Example1 e = new Example1();
		System.out.println(e.id + " " + e.name);

	}

}
