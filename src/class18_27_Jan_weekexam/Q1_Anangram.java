//Q1. Write a java program to check whether the two strings are anagram or not ? 
//( Hint: An anagaram of a string is contains  the same characters,only the order of the character are differrent
package class18_27_Jan_weekexam;

import java.util.Arrays;

public class Q1_Anangram {

	public static void main(String[] args) {
		String s1 = "Listen";
		String s2 = "Silent";

		s1 = s1.toLowerCase().replaceAll("\\s", "");
		s2 = s2.toLowerCase().replaceAll("\\s", "");

		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println(s1 + " and " + s2 + " are anagrams.");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams.");
		}

	}

}
