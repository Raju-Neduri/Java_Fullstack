package class26_08_feb_inheritance;

class Person1 {
	int id;
	String name;
	String city;

	public void accept(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;

	}

	public void show() {
		System.out.println("id:" + id);
		System.out.println("Name:" + name);
		System.out.println("city:" + city);
	}
}

class Student extends Person1 {
	int marks;

	public void get(int marks) {
		this.marks = marks;
	}

	public void display() {
		System.out.println("Marks:" + marks);
	}

}

public class SingleInheritance {

	public static void main(String[] args) {
		Student s = new Student();
		s.accept(13, "Raju", "Hyd");
		s.show();
		s.get(100);
		s.display();
	}

}
