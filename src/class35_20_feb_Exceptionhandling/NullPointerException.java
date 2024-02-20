package class35_20_feb_Exceptionhandling;

public class NullPointerException {

	public static void main(String[] args) {
		String s = "Vaishraj";
		System.out.println(s.length());
		System.out.println(s.substring(2));

		String s1 = " ";
		System.out.println(s1.length());

		try {
			String s2 = null;
			System.out.println(s2.length());
		} catch (Exception e) {
			System.out.println(e);

		}
		System.out.println("Rest");
	}

}
