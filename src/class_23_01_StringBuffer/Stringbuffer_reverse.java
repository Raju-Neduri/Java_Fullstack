package class_23_01_StringBuffer;

public class Stringbuffer_reverse {

	public static void main(String[] args) {
		String str = "Welcome";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println("original order = " + str);
		System.out.println("Reverse order = " + sb);
	}

}
