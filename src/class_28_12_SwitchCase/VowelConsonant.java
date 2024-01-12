package class_28_12_SwitchCase;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a character: ");
		char inputChar = sc.next().charAt(0);

		switch (inputChar) {
		case 'a':
			System.out.println(inputChar + " is a vowel.");
			break;
		case 'e':
			System.out.println(inputChar + " is a vowel.");
			break;
		case 'i':
			System.out.println(inputChar + " is a vowel.");
			break;
		case 'o':
			System.out.println(inputChar + " is a vowel.");
			break;
		case 'u':
			System.out.println(inputChar + " is a vowel.");
			break;
		case 'A':
			System.out.println(inputChar + " is a vowel.");
			break;
		case 'E':
			System.out.println(inputChar + " is a vowel.");
			break;
		case 'I':
			System.out.println(inputChar + " is a vowel.");
			break;
		case 'O':
			System.out.println(inputChar + " is a vowel.");
			break;
		case 'U':
			System.out.println(inputChar + " is a vowel.");
			break;
		default:
			System.out.println(inputChar + " is a consonant.");
		}
	}

}
