package class20_01_Feb_Static;

public class StaticEX {
	static int a = m1();

	static {
		System.out.println("Inside the static");
	}

	static int m1() {
		System.out.println("from m1");
		return 20;
	}

	public static void main(String[] args) {

		System.out.println("Value of a:" + a);
	}

}
