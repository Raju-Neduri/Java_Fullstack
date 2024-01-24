package class_24_01_StringBuilder;

public class StringBuilder_append {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb.append("java"));

		StringBuilder sb1 = new StringBuilder("Raju");
		System.out.println(sb1.insert(1, "Neduri"));

		StringBuilder sb2 = new StringBuilder("Raju Neduri");
		System.out.println(sb2.delete(4, 11));

		StringBuilder sb3 = new StringBuilder("Raju Neduri");
		System.out.println(sb3.replace(2, 6, "Raju"));

		StringBuilder sb4 = new StringBuilder("Raju");
		sb4.reverse();
		System.out.println(sb4);

		StringBuffer sb5 = new StringBuffer("welcome");
		int s = sb5.capacity();
		System.out.println(s);

	}

}
