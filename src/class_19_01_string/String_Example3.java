package class_19_01_string;

public class String_Example3 {

	public static void main(String[] args) {

		String s1 = new String("Raju");
		String s2 = "king";
		String s3 = "vaishu";
		s2.concat("Neduri");
		System.out.println("concated String: " + s2);
		s2 = s2.concat(s3);
		System.out.println(s2);

		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
	}
}
