//Accepting values for jaggged array
package class_18_01_jaggedArrays;

import java.util.Scanner;

public class JaggedArrayEX2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a[][] = new int[4][];
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[4];
		a[3] = new int[5];

		// code to take input from the user
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.println("Enter the value for  row " + i + " column " + j + " :");
				a[i][j] = sc.nextInt();

			}
			System.out.println("next row");

		}

		// code to print
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
