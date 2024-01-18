package class_18_01_jaggedArrays;

public class JaggedArrayEX1 {

	public static void main(String[] args) {
		// Create a jagged array
		int[][] jaggedArray = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };

		// Access and print elements of the jagged array
		for (int i = 0; i < jaggedArray.length; i++) {
			for (int j = 0; j < jaggedArray[i].length; j++) {
				System.out.print(jaggedArray[i][j] + " ");
			}
			System.out.println();
		}

	}

}
