package class24_06_Feb_ConstructorChaining;

public class Student {
	int id;
	String name;
	double salary;

	public void accept(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public void fetch(int id, String name, double salary) {
		accept(id, name);
		this.salary = salary;

	}

	public void show() {
		System.out.println("id " + id + "\nname: " + name + "\nSalary: " + salary);

	}

	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student();
		s.fetch(2, "Raju", 750900);
		s1.fetch(1, "Ram", 229929);

		s.show();
		s1.show();

	}

}
