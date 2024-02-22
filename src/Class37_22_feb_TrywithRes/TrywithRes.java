package Class37_22_feb_TrywithRes;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

public class TrywithRes {

	public static void main(String[] args) {
		try (FileOutputStream f = new FileOutputStream("msg.txt");
				BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
			String s;
			while ((s = br.readLine()) != null) {
				byte arr[] = s.getBytes();
				f.write(arr);
			}
			System.out.println("content Copied");
		} catch (Exception e) {
			System.out.println("Resources are closed and content is copied");
		}

	}

}
