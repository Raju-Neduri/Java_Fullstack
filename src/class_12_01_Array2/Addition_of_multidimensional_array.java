//wap to perform addition of column values of each rows
package class_12_01_Array2;

import java.util.Scanner;

public class Addition_of_multidimensional_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows");
		int r = sc.nextInt();

		System.out.println("Enter the no.of colums");
		int c = sc.nextInt();

		int a[][] = new int[r][c];
		int i, j, res;
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				System.out.println("Enter the value of row " + i + " column " + j + ":");
				a[i][j] = sc.nextInt();
			}
		}

		for (i = 0; i < r; i++) {
			res = 0;
			for (j = 0; j < c; j++) {
				res += a[i][j];
			}
			System.out.println("Addition of values of row " + i + "=" + res);
		}
	}
}
