//4.Write a java program to concat a given string at the end of another string.
package class_22_01_String2;

import java.util.Scanner;

public class P4_Concat_two_Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1 = sc.next();

		System.out.println("Enter the second string");
		String s2 = sc.next();

		System.out.println(s1.concat(s2));// using concat
		System.out.println(s1 + s2);// using +

	}

}
