package class26_08_feb_inheritance;

class Employee {

	int id;
	String name;

	public void accept(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void show() {
		System.out.println("Id:" + id);
		System.out.println("Name:" + name);
	}

}

class Manager extends Employee {
	String designation;

	public void get(String designation) {
		this.designation = designation;
	}

	public void display() {
		System.out.println("Designation: " + designation);
	}

}

public class EmployeeInheritance {

	public static void main(String[] args) {

		Manager m = new Manager();
		m.accept(001, "Suresh");
		m.show();
		m.get("Manager");
		m.display();

	}

}
