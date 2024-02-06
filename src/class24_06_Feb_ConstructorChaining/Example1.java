package class24_06_Feb_ConstructorChaining;

public class Example1 {
	String name;
	int year;
	String city;

	public Example1(String name, int year) {
		this.name = name;
		this.year = year;

	}

	public Example1(String name, int year, String city) {
		this(name, year);
		this.city = city;

	}

	public Example1(String name) {
		this.name = name;
	}

	void show() {
		System.out.println(name + " " + year + " " + city);
	}

	public static void main(String[] args) {
		Example1 ex = new Example1("Raju", 1999, "hyd");
		ex.show();
		Example1 ex1 = new Example1("ram");
		ex1.show();

	}

}
