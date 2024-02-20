package class35_20_feb_Exceptionhandling;

public class NumberFormatException {

	public static void main(String[] args) {
		String s = "Raju";
		try {
			float f = Float.parseFloat(s);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}

}
