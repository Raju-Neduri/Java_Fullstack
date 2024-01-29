package class19_29_01_Objec;

public class Static_Block {
	static int data;
	int data1;

	static {
		data = 100;
		// data1=100 we can not access non static data members
		System.out.println("Inside the static block:" + data);
	}

	public static void main(String[] args) {
		System.out.println("inside the main block");

	}

}
