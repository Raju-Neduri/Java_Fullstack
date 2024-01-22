package class_22_01_String2;

public class Stringreplace {
	public static void main(String args[]) {
		String s = "AshokIT";
		String s1 = "AshokIT";
		String s3 = "ashokIT";
		System.out.println(s1.equalsIgnoreCase(s3));

		String s2 = new String("AshokIT");

		System.out.println("\nEquals method");
		System.out.println(s1.equals(s2));// equals method is used to compare the content
		System.out.println(s.equals(s1));

		System.out.println("\n=============================");
		System.out.println(s1 == s2);
		System.out.println(s == s1);

	}

}
