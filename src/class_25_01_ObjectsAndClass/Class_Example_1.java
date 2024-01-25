package class_25_01_ObjectsAndClass;

public class Class_Example_1 {
	int id;
	String name;

	public static void main(String[] args) {

		Class_Example_1 student = new Class_Example_1();
		student.id = 100;
		student.name = "Raju";

		Class_Example_1 trainer = new Class_Example_1();
		trainer.id = 100;
		trainer.name = "Raju";

		System.out.println(student.id);
		System.out.println(student.name);

	}

}
