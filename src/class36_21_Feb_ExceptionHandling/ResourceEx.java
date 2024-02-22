package class36_21_Feb_ExceptionHandling;

import java.io.FileOutputStream;

public class ResourceEx {

	public static void main(String[] args) {
		try (FileOutputStream f = new FileOutputStream("text.txt")) {
			String msg = "Hello Students";
			byte ar[] = msg.getBytes();
			f.write(ar);

		} catch (Exception e) {
			System.out.println(e);

		}
		System.out.println("Resource Handled");
	}

}
