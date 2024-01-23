package string_Practice;

public class String_equalsIgnoreCase {

	public static void main(String[] args) {
		String s1 = "RajuNeduri";
		String s2 = "RajuNEDURI";
		String s3 = "RAJUneduri";
		String s4 = "Vaishu";

		System.out.println(s1.equalsIgnoreCase(s2));//
		System.out.println(s1.equalsIgnoreCase(s3));//
		System.out.println(s1.equalsIgnoreCase(s4));//

	}

}
