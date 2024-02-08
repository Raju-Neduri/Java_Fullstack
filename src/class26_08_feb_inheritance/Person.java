package class26_08_feb_inheritance;

public class Person {
	int id;
	String name;
	String city;

	public void accept(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;

	}

	public void show() {
		System.out.println(id + " " + name + " " + city);
	}

	class Student extends Person {
		int marks;

		public void get(int marks) {
			this.marks = marks;
		}

	}

	public static void main(String[] args) {

	}

}
