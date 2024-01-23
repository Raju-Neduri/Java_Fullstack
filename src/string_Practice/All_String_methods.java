package string_Practice;

public class All_String_methods {

	public static void main(String[] args) {
		String s1 = "Raju";
		String s2 = "Raju";
		String s3 = "Neduri";

		// Using Java String charAt()
		char ch = s1.charAt(2);
		System.out.println("character At 2 index = " + ch);

		// Java String compareTo()
		System.out.println("Comparing: " + s1.compareTo(s2));

		// Java String concat
		System.out.println("\nJava String concat");
		System.out.println("Concat of s1 and s3 = " + s1.concat(s3));
		System.out.println("Concat of s1 with another = " + s1.concat(" Neduri is my name"));
		String concat = "My name is ".concat(s1);
		System.out.println(concat);
	}

}
