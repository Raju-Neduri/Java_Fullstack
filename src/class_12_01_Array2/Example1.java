package class_12_01_Array2;

import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows for the first matrix:");
		int rowsA = sc.nextInt();
		System.out.println("Enter the number of columns for the first matrix:");
		int colsA = sc.nextInt();

		System.out.println("Enter the number of rows for the second matrix:");
		int rowsB = sc.nextInt();
		System.out.println("Enter the number of columns for the second matrix:");
		int colsB = sc.nextInt();

		if (colsA != rowsB) {
			System.out.println(
					"Matrix multiplication is not possible. Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
			return;
		}

		int[][] matrixA = new int[rowsA][colsA];
		int[][] matrixB = new int[rowsB][colsB];

		System.out.println("Enter the elements of the first matrix:");
		fillMatrix(sc, matrixA);

		System.out.println("Enter the elements of the second matrix:");
		fillMatrix(sc, matrixB);

		// Resultant matrix
		int[][] resultMatrix = new int[rowsA][colsB];

		// Matrix multiplication
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < colsB; j++) {
				for (int k = 0; k < colsA; k++) {
					resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}

		// Displaying the result
		System.out.println("Resultant Matrix (Matrix A * Matrix B):");
		displayMatrix(resultMatrix);
	}

	private static void fillMatrix(Scanner sc, int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
	}

	private static void displayMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
