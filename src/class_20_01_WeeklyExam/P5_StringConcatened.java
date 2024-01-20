//create a string,concat the same string display the concatenated string
package class_20_01_WeeklyExam;

public class P5_StringConcatened {

	public static void main(String[] args) {

		String s = "Hello, World!";

		// Concatenate the same string
		String concatenatedString = s.concat(s);

		System.out.println(concatenatedString);
	}
}
