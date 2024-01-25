//8. Write a program to count the words  in the string
package string_Practice;

import java.util.Scanner;

public class A8_Count_words {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			s.charAt(i);
			count++;
		}
		System.out.println(count);

	}

}
