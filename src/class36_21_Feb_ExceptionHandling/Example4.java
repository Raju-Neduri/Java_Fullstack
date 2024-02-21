package class36_21_Feb_ExceptionHandling;

public class Example4 {

	public static void main(String[] args) {
		String s = "Raju";
		try {
			int x = Integer.parseInt(s);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
