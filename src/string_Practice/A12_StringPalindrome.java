// 12.Wap to check whether the given string is palindrome or not ?

//(Hint : original string and reverse of a string are both are same Ex:Madam-- madam
package string_Practice;

import java.util.Scanner;

public class A12_StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();

		String reversed = new StringBuilder(str).reverse().toString();
		boolean result = str.equals(reversed);
		System.out.println(result);

		if (result) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}

	}

}
