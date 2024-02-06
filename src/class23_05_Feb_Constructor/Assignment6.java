/*
 * write a java program to print the names of students by creating  a student  class
 *  if no name is passed  while creating an object of a student class then the name should be
 *  "unknown" . otherwise  the name should be equal  to the string  value passed while creating
 *  object of student class
 */

package class23_05_Feb_Constructor;

class Student {
	String name;

	// Constructor with default value "unknown" if no name is passed
	public Student() {
		this.name = "unknown";
	}

	// Constructor with parameter to set the name if provided
	public Student(String name) {
		this.name = name;
	}

	public void displayName() {
		System.out.println("Student Name: " + name);
	}

}

public class Assignment6 {

	public static void main(String[] args) {

		Student student1 = new Student();
		Student student2 = new Student("Vamshi");
		student1.displayName();
		student2.displayName();

	}

}
