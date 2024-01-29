package class_25_01_ObjectsAndClass;

class Calculator {

	public int add(int a, int b) {
		int res = a * b;
		return res;

	}
}

public class Practice1 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int res = calc.add(4, 7);
		System.out.println(res);

	}
}
