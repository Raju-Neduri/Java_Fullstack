//Q11.write a program to reverse a string using string class methods
package string_Practice;

import java.util.Scanner;

public class A11_Reverse_a_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();

		String s = "";
		int i, len;
		len = str.length();

		for (i = len - 1; i >= 0; i--) {
			s = s + str.charAt(i);

		}
		System.out.println("original order = " + str);
		System.out.println("Reversed Order = " + s);
	}

}
