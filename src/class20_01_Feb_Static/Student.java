// create a class named " Student with string variable 'name' and integer variable roll  no
// assign the value of roll_no as 2 and that  of name as "john" by creating an object of te  
//class student

package class20_01_Feb_Static;

class Student1 {

	String name;
	int rollno;

	void acceept(String name, int rollno) {
		name = "john";
		rollno = 2;
	}
}

public class Student {
	public static void main(String[] args) {
		Student1 s = new Student1();

		System.out.println(s.rollno); // prints: 2
	}
}
