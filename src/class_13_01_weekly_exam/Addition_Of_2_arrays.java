//1 Wap to perform addition of 2 array elements
package class_13_01_weekly_exam;

public class Addition_Of_2_arrays {

	public static void main(String[] args) {

		int array1[] = { 1, 2, 3, 4, 5 };
		int array2[] = { 6, 7, 8, 9, 10 };
		int res[] = new int[5];

		for (int i = 0; i < 5; i++) {
			res[i] = array1[i] + array2[i];
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(res[i] + " ");
		}
	}
}