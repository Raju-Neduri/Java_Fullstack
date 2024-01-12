//Wap  to display 3 weeks and 7days  in each week
package class_05_01_ForLoop;

public class Week_7days {

	public static void main(String[] args) {

		int i, j;
		for (i = 1; i <= 3; i++) {
			System.out.println("week" + i);
			for (j = 1; j <= 7; j++) {
				System.out.println("day" + j);
			}
		}
	}

}
