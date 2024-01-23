//Java string contains
package string_Practice;

public class String_contains {

	public static void main(String[] args) {
		String s = "India is my country";

		System.out.println(s.contains("India")); // true because string contains India
		System.out.println(s.contains("INDIA")); // false because java is case sensitive

	}

}
