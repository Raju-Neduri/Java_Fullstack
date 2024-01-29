package class19_29_01_Objec;

public class Static_method2 {

	static int a = 40;
	int b = 5;

	void display() {
		System.out.println(a);
		System.out.println(b);
	}

	static void static_display() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Static_method2 m = new Static_method2();

		m.display();
		static_display();
	}

}
