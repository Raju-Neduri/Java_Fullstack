//2.  wap to create 2 strings by using literals and string constructor  nd check equality of both strings

package class_20_01_WeeklyExam;

public class P2_EqualityOfBothStrings {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";

		String str3 = new String("Hello");
		String str4 = new String("World");

		boolean areLiteralsEqual = str1.equals(str2);
		boolean areConstructorsEqual = str3.equals(str4);

		// Display results
		System.out.println("Equality of strings created using literals: " + areLiteralsEqual);
		System.out.println("Equality of strings created using constructors: " + areConstructorsEqual);
	}
}
