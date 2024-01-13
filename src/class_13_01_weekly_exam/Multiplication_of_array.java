// 2 Write a program to print matrix (4*3) multiplication of each element of  array.

package class_13_01_weekly_exam;

public class Multiplication_of_array {

	public static void main(String[] args) {
		int matrix1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int matrix2[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

		int res[][] = new int[4][3];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					res[i][j] += matrix1[i][k] * matrix2[j][k];
				}

			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}

}
