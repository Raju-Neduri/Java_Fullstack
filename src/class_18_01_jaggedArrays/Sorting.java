package class_18_01_jaggedArrays;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		int a[] = new int[] { 2, 39, 22, 3, 12, 3, 5, 1, 34, 55, 9 };

		Arrays.sort(a);
		System.out.print("Ascending order sorting Array :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		Integer b[] = { 2, 23, 84, 56, 394, 48, 39, 90, 49 };

		Arrays.sort(b, Collections.reverseOrder());
		System.out.println();
		System.out.print("Descending order sorting Array :");
		for (int j = 0; j < b.length; j++) {
			System.out.print(b[j] + " ");
		}

	}

}
