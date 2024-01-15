package class_12_01_Array2;

import java.util.Scanner;

public class Sum_multidimensional {
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

		// second matrix code
		System.out.println("\nEnter the rows of 2nd matrix");
		int rows2 = sc.nextInt();
		System.out.println("Enter the columns of 2nd matrix");
		int col2 = sc.nextInt();

		// code for taking values for matrix 2
		int matrix2[][] = new int[rows2][col2];
		for (int i = 0; i < rows2; i++) {
			for (int j = 0; j < col2; j++) {
				System.out.println("Enter the value of matrix 2 - row " + i + " column " + j + ":");
				matrix2[i][j] = sc.nextInt();
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

		// printing values of matrix 2
		System.out.println("Values of matrix 2");
		for (int k = 0; k < rows2; k++) {
			for (int l = 0; l < col2; l++) {
				System.out.print(matrix2[k][l] + " ");
			}
			System.out.println();
		}

		// Checking if the matrices can be added
		if (rows != rows2 || col != col2) {
			System.out.println("Matrices cannot be added. Dimensions are different.");
			return;
		}

		// Adding matrices
		System.out.println();
		int res[][] = new int[rows][col];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				res[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		// printing the addition matrix
		System.out.println("Values of result matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}

}
