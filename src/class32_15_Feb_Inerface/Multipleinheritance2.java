package class32_15_Feb_Inerface;

interface A1 {
	void show();

}

interface B1 {
	void get(int num);

	void show();
}

class ABC implements A1, B1 {
	int num;

	public void get(int num) {
		this.num = num;
		System.out.println("getting value from the user");
	}

	public void show() {
		System.out.println("value passed for n is " + num);
	}
}

public class Multipleinheritance2 {

	public static void main(String[] args) {
		ABC a = new ABC();
		a.get(10);
		a.show();

	}

}
