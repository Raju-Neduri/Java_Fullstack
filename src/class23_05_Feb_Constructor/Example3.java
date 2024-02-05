package class23_05_Feb_Constructor;

public class Example3 {
	int id;
	String name;

	public Example3(int id, String name) {
		this.id = id;
		this.name = name;

		System.out.println("id-" + id + ", name-" + name);
	}

	public static void main(String[] args) {
		Example3 ex = new Example3(3, "Raju");

	}

}
