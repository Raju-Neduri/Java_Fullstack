// Assignent 7 - Write a program to create a new string repeating every character twice  of a given string
package string_Practice;

import java.util.Scanner;

public class A7_Every_Character_twice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();

		System.out.println(input.replaceAll(".", "$0$0"));
// . (matches any character) and the replacement pattern $0$0 (repeats each character twice)

	}

}
