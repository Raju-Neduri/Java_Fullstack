/*
 * Q.1 WAP to show use of constructor chaining where college is default constructor,
 *  another constructor takes two parameters name and year, one more constructor 
 *  which accepts only name as parameter
 */

package class24_06_Feb_ConstructorChaining;

class College {
	String name;
	int year;

	public College() {
	}

	public College(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public College(String name) {
		this(name, 0);

	}

	public void displayDetails() {
		System.out.println("\nCollege Name: " + name + ", Est. Year: " + year);
	}

}

public class CollegeConstruction {

	public static void main(String[] args) {
		College college1 = new College();
		College college2 = new College("Kakatiya institute of technology");
		College college3 = new College("Kakatiya institute of technology", 1990);

		college1.displayDetails();
		college2.displayDetails();
		college3.displayDetails();
	}

}
