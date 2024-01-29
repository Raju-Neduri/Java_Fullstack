// 1) Object and Class Example: Initialization through reference

package class_25_01_ObjectsAndClass;

class Student {
	int id;
	String name;
}

public class ByReference1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 100;
		s1.name = "Raju";
		System.out.println(s1.id + " " + s1.name);// printing members with a white space
	}

}
