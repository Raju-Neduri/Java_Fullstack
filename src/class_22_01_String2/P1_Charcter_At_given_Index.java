//write a program to get  character of the given index within the string

package class_22_01_String2;

import java.util.Scanner;

public class P1_Charcter_At_given_Index {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();

		System.out.print("Enter the index: ");
		int index = sc.nextInt();

		char ch = s.charAt(index);
		System.out.println(ch);

	}

}
