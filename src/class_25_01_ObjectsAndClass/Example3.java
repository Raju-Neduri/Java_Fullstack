package class_25_01_ObjectsAndClass;

public class Example3 {

	int id;
	String name;

	void accept(int i, String n) {
		id = i;
		name = n;

	}

	void display() {
		System.out.println("Id: " + id + ", name: " + name);

	}

	public static void main(String[] args) {
		Example3 student = new Example3();
		Example3 trainer = new Example3();

		student.accept(20, "Raju");
		student.display();

		trainer.accept(1, "Shital");
		trainer.display();
	}
}
