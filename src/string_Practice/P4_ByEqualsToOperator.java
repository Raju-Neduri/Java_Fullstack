
//The == operator compares references not values.

package string_Practice;

public class P4_ByEqualsToOperator {

	public static void main(String[] args) {
		String s1 = "Raju";
		String s2 = "Raju";
		String s3 = new String("Raju");

		System.out.println(s1 == s2);// true (because both refer to same instance)
		System.out.println(s1 == s3);// false(because s3 refers to instance created in nonpool)
	}

}
