package classOjectsMethods;

public class ThisExample {
	int a;

	ThisExample(int a) {
		this.a = a;
	}

	void show() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		ThisExample ex = new ThisExample(100);
		ex.show();

	}

}
