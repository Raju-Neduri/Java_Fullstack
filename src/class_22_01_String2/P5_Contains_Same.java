//5 Wap to check whether two strings objects 	contain the same data
package class_22_01_String2;

import java.util.Scanner;

public class P5_Contains_Same {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1 = sc.next();

		System.out.println("Enter the second string");
		String s2 = sc.next();

		boolean str = s1.contains(s2);
		if (str == true) {
			System.out.println("Both strings objects contains the same data");
		} else {
			System.out.println("Both strings objects doesn't contains the same data");

		}
	}

}
