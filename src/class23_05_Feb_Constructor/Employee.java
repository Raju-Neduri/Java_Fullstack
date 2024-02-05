package class23_05_Feb_Constructor;

public class Employee {

	String name;
	String epos;
	double sal;
	int id;

	Employee(String name) {
		System.out.println("First constructor :" + name);

	}

	Employee(String epos, double sal) {
		System.out.println("Second Constructor :" + epos + " " + sal);

	}

	Employee(int id) {
		System.out.println("Third Constructor :" + id);
	}

	Employee(String name, String epos, double sal, int id) {
		System.out.println("Fourth constructor :" + name + " " + epos + " " + sal + " " + id);

	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Raju");
		Employee e2 = new Employee("developer", 100000);
		Employee e3 = new Employee(35525);
		Employee e4 = new Employee("Raju", "Developer", 100000, 35525);

	}

}
