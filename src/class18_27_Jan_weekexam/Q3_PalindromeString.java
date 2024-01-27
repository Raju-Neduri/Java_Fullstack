//Q3.Write a java program to check  given string is palindrome or not using inbuilt methods
package class18_27_Jan_weekexam;

import java.util.Scanner;

public class Q3_PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();

		s = s.replaceAll("\\s", "").toLowerCase();

		int length = s.length();
		int mid = length / 2;
		boolean isPalindrome = true;

		for (int i = 0; i < mid; i++) {
			if (s.charAt(i) != s.charAt(length - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println(s + " is a palindrome");
		} else {
			System.out.println(s + " is not a palindrome");
		}

	}
}
