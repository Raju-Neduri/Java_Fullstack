//Write a java program to count words without using inbuilt methods
package string_Practice;

import java.util.Scanner;

public class A9_Count_words_without {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();

		int count = 0;
		boolean inWord = false;

		for (int i = 0; i < s.length(); i++) {
			char currentChar = s.charAt(i);

			if (currentChar != ' ') {
				if (!inWord) {
					count++;
					inWord = true;
				}
			} else {
				inWord = false;
			}
		}

		System.out.println(count);
	}
}