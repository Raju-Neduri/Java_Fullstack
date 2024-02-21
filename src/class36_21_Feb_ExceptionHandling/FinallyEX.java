package class36_21_Feb_ExceptionHandling;

public class FinallyEX {

	public static void main(String[] args) {
		String s = "Raju";
		try {
			int x = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException: " + e);
		} finally {
			System.out.println("This block always gets Executed");
		}
		System.out.println("Rest of the Code");
		System.out.println(" ");

		// Second block

		int a = 20; // assuming 'a' is supposed to be used here
		try {
			int res = a / 10;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException: " + e);
		} finally {
			System.out.println("This block always gets Executed");
		}
	}
}
