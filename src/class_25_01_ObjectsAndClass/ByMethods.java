// 2) Object and Class Example: Initialization through method

package class_25_01_ObjectsAndClass;

class Students {
	int rollno;
	String name;

	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}

	void displayInformation() {
		System.out.println(rollno + " " + name);
	}
}

//end of class

public class ByMethods {

	public static void main(String[] args) {
		Students s1 = new Students();
		Students s2 = new Students();
		s1.insertRecord(111, "Karan");
		s2.insertRecord(222, "Aryan");
		s1.displayInformation();
		s2.displayInformation();

	}

}
