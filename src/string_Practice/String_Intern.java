/*
 * intern() The method intern() creates an exact copy of a String object in the heap memory 
 * and stores it in the String constant pool. 
 * Note that, if another String with the same contents exists in the String constant pool, 
 * then a new object won't be created and the new reference will point to the other String.
 */
package string_Practice;

public class String_Intern {

	public static void main(String[] args) {
		String s1 = "Raju";
		String s2 = "Raju";
		String s3 = new String("Raju");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		String s4 = s3.intern();
		System.out.println(s1 == s4);

		String s5 = "Raju".intern();
		System.out.println(s1 == s5);
	}

}
