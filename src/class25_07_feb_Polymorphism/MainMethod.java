package class25_07_feb_Polymorphism;

public class MainMethod {

	public static void main(int num) {
		System.out.println("Method with integer number:" + num);
	}

	public static void main(String str) {
		System.out.println("Method with String arg :" + str);
	}

	public static void main(String[] args) {
		System.out.println("Method with the string Arguments[]");
		main(10);
		main("Ram");
	}

}
