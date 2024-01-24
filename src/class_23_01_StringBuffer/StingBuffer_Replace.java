package class_23_01_StringBuffer;

public class StingBuffer_Replace {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("He is coming");
		sb.replace(3, 5, "was");
		System.out.println(sb);
	}

}
