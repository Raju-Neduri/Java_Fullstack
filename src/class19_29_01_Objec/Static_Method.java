package class19_29_01_Objec;

public class Static_Method {

	int id;
	String name;

	static String comp_name = "TCS";

	public void accept(int id, String name, String comp_name) {
		this.id = id;
		this.name = name;

	}

	public void display() {
		System.out.println("id=" + id + ", name=" + name + ", Company name=" + comp_name);
	}

	public void show() {
		System.out.println("\nShowing use of Static keyword\n");
	}

	public static void main(String[] args) {
		Static_Method m = new Static_Method();
		Static_Method m1 = new Static_Method();

		m.accept(1, "Shital", " ");
		m.display();
		m.show();

		m1.accept(2, "Raju", " ");
		m1.display();
		m1.show();

	}

}
