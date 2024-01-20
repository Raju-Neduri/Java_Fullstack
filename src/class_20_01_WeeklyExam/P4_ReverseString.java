//Q4. wap to reverse an array of integers using predefined methods
package class_20_01_WeeklyExam;

import java.util.Arrays;
import java.util.Collections;

public class P4_ReverseString {

	public static void main(String[] args) {
		Integer a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Arrays.sort(a, Collections.reverseOrder());

		System.out.print("Reverse order : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
