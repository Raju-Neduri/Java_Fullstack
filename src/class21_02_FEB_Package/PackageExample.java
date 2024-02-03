package class21_02_FEB_Package;

import class_22_01_String2.*;// importing another package by * we can access all classes in that package 

public class PackageExample {

	public static void main(String[] args) {
		Reverse_String_23_01 reverse = new Reverse_String_23_01(); // accessing the another by creating object
		reverse.display();

		StringPackageEx ex = new StringPackageEx();
		ex.msg();

	}

}
