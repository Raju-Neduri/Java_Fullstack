package class35_20_feb_Exceptionhandling;

public class ExceptionhandlingEx1 {

	public static void main(String[] args) {

		int x = 100, res = 0;
		try {
			res = x / 0;
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println(res);
		System.out.println("Hello Students");

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}

}
