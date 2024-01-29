// Java Program to illustrate how to define a class and fields

//Object and Class Example: main within the class

// Defining a Student class.

package class_25_01_ObjectsAndClass;

public class Practice2 {

	// defining fields
	int id;// field or data member or instance variable
	String name;

	// creating main method inside the Student class
	public static void main(String args[]) {
		// Creating an object or instance
		Practice2 s1 = new Practice2();// creating an object of Student
		// Printing values of the object
		System.out.println(s1.id);// accessing member through reference variable
		System.out.println(s1.name);
	}
}
