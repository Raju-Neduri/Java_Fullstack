package string_Practice;

public class Immutable {

	public static void main(String[] args) {
		String s = "Raju";
		s.concat(" Neduri");// concat() method appends the string at the end

		System.out.println(s);// will print Raju because strings are immutable objects
		System.out.println();

		String s1 = "Rama";
		s1 = s1.concat(" Neduri");/// we explicitly assign it to the reference variable,
		System.out.println(s1);
	}

}
