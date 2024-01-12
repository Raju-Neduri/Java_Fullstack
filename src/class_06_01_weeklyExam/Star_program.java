/* 
Wap to print star pattern

		* * * *
		* * *
		* *
		*
*/
package class_06_01_weeklyExam;

public class Star_program {

	public static void main(String[] args) {
		int rows = 4;
		for (int i = 0; i <= rows; i++) {
			for (int j = i; j < rows; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
