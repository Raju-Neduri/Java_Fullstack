//2.write a program to compare two strings lexicographically,
//equals if they are the same length 
// and contain the same characters in the same position
package class_22_01_String2;

import java.util.Scanner;

public class P2_CompareTwoStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1 = sc.next();

		System.out.println("Enter the second string");
		String s2 = sc.next();

		boolean sameLength = s1.length() == s2.length(); // checking length

		boolean compare = s1.compareTo(s2) == 0; // lexicographically compare

		boolean sameCharacters = true;
		int minLength = Math.min(s1.length(), s2.length());// to find min length in both strings
		for (int i = 0; i < minLength; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				sameCharacters = false;
				break;
			}
		}

		if (sameLength && compare && sameCharacters) {
			System.out.println("The strings are the same length and have the same characters in the same position.");
		} else {
			System.out.println(
					"The strings are either of different lengths or do not have the same characters in the same position.");
		}

	}

}
