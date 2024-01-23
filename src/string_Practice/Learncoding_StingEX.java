package string_Practice;

public class Learncoding_StingEX {

	public static void main(String[] args) {
		String a = "RAJU";
		String b = "ramu";

		System.out.println(a.toLowerCase());// lowercase
		System.out.println(b.toUpperCase());// Upper case

		System.out.println(b.concat(a));// Concat
		System.out.println(b.length());// to find length

		String c = "    Vaishu   ";
		System.out.println(c.trim());// to trim the extra spaces

		String d = "";
		System.out.println(d.isEmpty()); // to find is it empty

	}

}
