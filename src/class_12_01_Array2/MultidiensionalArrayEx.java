package class_12_01_Array2;

import java.util.Scanner;

public class MultidiensionalArrayEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the rows");// taking size of the rows
		int r = sc.nextInt();

		System.out.println("Enter the size of the rows");// taking size of the columns
		int c = sc.nextInt();

		// loop to taking the inputs for the array
		int a[][] = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.println("Enter the value of row " + i + " column " + j + ":");
				a[i][j] = sc.nextInt();
			}
		}

		// printing the order of the array
		System.out.println();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
