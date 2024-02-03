package classOjectsMethods;

import java.util.Arrays;

public class Methods2 {

	public static void main(String[] args) {

		Methods2 m = new Methods2();// object creation
		int arr[] = { 1, 2, 3, 4 };
		m.print(arr);
		m.fullname("Raju", "Neduri");

	}

	void fullname(String fname, String lname) {
		String name = fname + lname;
		System.out.println(name);
	}

	void print(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}

}
