package string_Practice;

public class String_EndsWith {

	public static void main(String[] args) {
		String s = "India is my country";
		System.out.println(s.endsWith("y"));
		System.out.println(s.endsWith("try"));

		System.out.println(s.endsWith("Country"));// false because case sensitive
		System.out.println(s.endsWith("is"));

		// prints true
		System.out.println(s.endsWith(""));
		// prints false as there is no white space after the string
		System.out.println(s.endsWith(" "));
	}

}
