//2.  wap to create 2 strings by using literals and string constructor  nd check equality of both strigs

package class_20_01_WeeklyExam;

public class P2_EqualityOfBothStrings {

	public static void main(String[] args) {
		// Create strings using literals
		String str1 = "Hello";
		String str2 = "Hello";

		// Create strings using String constructor
		String str3 = new String("Hello");
		String str4 = new String("World");

		// Check equality using equals() method
		boolean areLiteralsEqual = str1.equals(str2);
		boolean areConstructorsEqual = str3.equals(str4);

		// Display results
		System.out.println("Equality of strings created using literals: " + areLiteralsEqual);
		System.out.println("Equality of strings created using constructors: " + areConstructorsEqual);
	}
}
