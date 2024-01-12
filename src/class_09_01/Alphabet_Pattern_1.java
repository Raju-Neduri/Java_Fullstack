
/*
 Print the pattern 
A 
B C
D E F 
G H I J 
K L M N O

 */

package class_09_01;

import java.util.Scanner;

public class Alphabet_Pattern_1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.of lines");
		int n = sc.nextInt();

		int i, j, k = 65;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print((char) k);
				k++;
			}

			System.out.println();
		}
	}

}
