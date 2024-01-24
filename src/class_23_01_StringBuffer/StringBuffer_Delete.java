package class_23_01_StringBuffer;

public class StringBuffer_Delete {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("My name is Raju");
		sb.delete(0, 11);
		System.out.println(sb);
	}

}
