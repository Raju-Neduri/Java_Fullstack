//wap to perform sum of cols in each row from jagged array
package class_18_01_jaggedArrays;

public class SumOfcols_Array {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 3, 3, 45, 5 }, { 20, 21 } };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum = sum + a[i][j];
			}
			System.out.println("sum of " + (i + 1) + " row" + ": " + sum);
		}

	}

}
