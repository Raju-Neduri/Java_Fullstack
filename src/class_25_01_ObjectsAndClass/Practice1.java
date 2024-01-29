package class_25_01_ObjectsAndClass;

class Calculator {

	public int add(int a, int b) {
		int res = a * b;
		return res;

	}
}

public class Practice1 {

	public static void main(String[] args) {
		int num1 = 6, num2 = 8;
		Calculator calc = new Calculator();
		int res = calc.add(num1, num2);
		System.out.println(res);

	}
}
