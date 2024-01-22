package class_22_01_String2;

public class String_equals {

	public static void main(String[] args) {
		String s = "Raju neduri";
		String s1 = "Raju neduri";// it will be created in string constant pool

		String s2 = new String("Raju neduri");// in heap memory

		System.out.println("By using equals method in string");
		System.out.println(s.equals(s1));//
		System.out.println(s1.equals(s2));

		System.out.println("\nBy using == symbols");
		System.out.println(s1 == s2);
		System.out.println(s == s1);

	}

}
