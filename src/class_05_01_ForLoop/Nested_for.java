package class_05_01_ForLoop;

public class Nested_for {

	public static void main(String[] args) {
		int i, j = 0, addition;
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 5; j++) {
				addition = i + j;
				System.out.println(addition);
			}
		}
	}

}
