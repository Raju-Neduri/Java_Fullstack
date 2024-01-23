package string_Practice;

public class P3_Equals {

	// There are three ways to compare String in Java:
	//
	// 1 By Using equals() Method
	// 2 By Using == Operator
	// 3 By compareTo() Method

	public static void main(String args[]) {
		String s1 = "Raju";
		String s2 = "Raju";
		String s3 = new String("Raju");
		String s4 = "Neduri";
		String s5 = "RAJU";

		System.out.println(s1.equals(s2));// we are using equals
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));

		System.out.println(s1.equals(s5));// false because java is case senstive
		System.out.println(s1.equalsIgnoreCase(s5));// using equals ignore case

	}

}
