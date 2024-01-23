/*
 *          Java String equals()
 * he Java String class equals() method compares the two given strings based on the content of the string. 
 * If any character is not matched, it returns false. If all characters are matched, it returns true.
 */

package string_Practice;

public class String_equals {

	public static void main(String[] args) {
		String s1 = "Raju";
		String s2 = "Raju";
		String s3 = "RAJU";
		String s4 = "Vaishu";

		System.out.println(s1.equals(s3));// false case sensitive
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));

	}

}
