//3.wap to perform sum of elements from jagged array
package class_20_01_WeeklyExam;

public class P3_JaggedArraySum {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 }, { 3, 4, 5 } };

		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum = sum + a[i][j];
			}
			System.out.println("sum of " + (i + 1) + " row" + ": " + sum);

		}

	}

}
