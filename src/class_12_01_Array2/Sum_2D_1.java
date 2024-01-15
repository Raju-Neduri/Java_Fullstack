package class_12_01_Array2;

import java.util.Scanner;

public class Sum_2D_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows of 1st matrix");
		int rows = sc.nextInt();
		System.out.println("Enter the columns of 1st matrix");
		int col = sc.nextInt();

		// code for taking input for matrix 1
		int matrix1[][] = new int[rows][col];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter the value of matrix 1 - row " + i + " column " + j + ":");
				matrix1[i][j] = sc.nextInt();
			}
		}

		// printing the matrix 1
		System.out.println("Values of matrix 1");
		for (int k = 0; k < rows; k++) {
			for (int l = 0; l < col; l++) {
				System.out.print(matrix1[k][l] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
