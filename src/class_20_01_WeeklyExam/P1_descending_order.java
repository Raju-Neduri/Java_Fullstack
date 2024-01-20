//wap to sort given array in descending order
// 78,89,78,23,45,65,55,5,4,42,40

package class_20_01_WeeklyExam;

public class P1_descending_order {

	public static void main(String[] args) {
		int a[] = new int[] { 78, 89, 78, 23, 45, 65, 55, 5, 4, 42, 40 };

		System.out.print("Descending order: ");
		int i, j;
		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				int temp = 0;

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.print(a[i] + " ");
		}

	}

}
