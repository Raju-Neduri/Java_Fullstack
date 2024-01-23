//3. write a java program to compare two strings lexicographically, ignore case difference
package class_22_01_String2;

import java.util.Scanner;

public class P3_CompareToIgnore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1 = sc.next();

		System.out.println("Enter the second string");
		String s2 = sc.next();

		int result = s1.compareToIgnoreCase(s2);

		// Oresult
		if (result == 0) {
			System.out.println("The strings are lexicographically equal (ignoring case).");
		} else if (result < 0) {
			System.out.println("The first string comes before the second string lexicographically (ignoring case).");
		} else {
			System.out.println("The second string comes before the first string lexicographically (ignoring case).");
		}

	}

}
