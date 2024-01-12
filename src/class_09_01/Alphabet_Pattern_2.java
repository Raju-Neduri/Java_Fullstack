/*
 * A
 * A B 
 * A B C
 * A B C D
 */

package class_09_01;

import java.util.Scanner;

public class Alphabet_Pattern_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.of lines");
		int n = sc.nextInt();

		int i, j;

		for (i = 1; i <= n; i++) {
			char ch = 'A';
			for (j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}

			System.out.println();
		}
	}

}
