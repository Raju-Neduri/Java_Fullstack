package class36_21_Feb_ExceptionHandling;

public class Example2 {

	public static void main(String[] args) {

		int x = 100, res;
		String s = null;
		try {
			res = x / 0;
			System.out.println(s.length());

		} catch (Exception e) {
			System.out.println(e);// system generated
		}
		try {
			System.out.println(s.length());

		} catch (Exception e) {
			System.out.println("Null pointer Exception Occured");// message by programmer
		}
	}

}
