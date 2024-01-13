package class_12_01_Array2;

import java.util.Scanner;

public class Multi_dimensional2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows = sc.nextInt();
		System.out.println("Enter the columns");
		int col = sc.nextInt();

		int a[][] = new int[rows][col];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("enter the value of row " + i + " column " + j + ":");
				a[i][j] = sc.nextInt();
			}
		}
		for (int k = 0; k < rows; k++) {
			for (int l = 0; l < col; l++) {
				System.out.print(a[k][l] + " ");
			}
			System.out.println();
		}

	}

}
