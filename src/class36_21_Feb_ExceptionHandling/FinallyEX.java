package class36_21_Feb_ExceptionHandling;

public class FinallyEX {

	public static void main(String[] args) {
		String s = "Raju";
		try {
			int x = Integer.parseInt(s);
		} catch (Exception e) {
			System.out.println(e);

		} finally {

			System.out.println("This block always get Executed");
		}
		System.out.println("Rest of the Code");
	}

}
