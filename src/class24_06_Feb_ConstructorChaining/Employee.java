package class24_06_Feb_ConstructorChaining;

public class Employee {

	int id;
	String name;
	double salary;
	long phn;

	public Employee() {
		System.out.println("Default constructor");

	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public Employee(int id, String name, double salary) {
		this(id, name);
		this.salary = salary;

	}

	public Employee(int id, String name, double salary, long phn) {
		this(id, name, salary);
		this.phn = phn;

	}

	void show() {
		System.out.println(id + " " + name + " " + salary + " " + phn);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
