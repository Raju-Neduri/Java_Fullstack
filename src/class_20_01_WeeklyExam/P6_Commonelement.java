//Q6 write a java program to find the common element from two arrays
package class_20_01_WeeklyExam;

public class P6_Commonelement {

	public static void main(String[] args) {
		int a[] = { 1, 22, 14, 27, 39, 30 };
		int b[] = { 3, 21, 14, 39, 38, 42 };

		System.out.print("common elements are : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] == b[j]) {
					System.out.print(a[i] + " ");

				}

			}
		}

	}

}
