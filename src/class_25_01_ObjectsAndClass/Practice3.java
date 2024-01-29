//Java Program to demonstrate having the main method in   
//another class  
//Creating Practice3 class. 

package class_25_01_ObjectsAndClass;

class Practice3 {
	int id;
	String name;
}

//Creating another class TestSudent1 which contains the main method  

class TestStudent1 {
	public static void main(String args[]) {
		Practice3 s1 = new Practice3();
		System.out.println(s1.id);
		System.out.println(s1.name);
	}
}
