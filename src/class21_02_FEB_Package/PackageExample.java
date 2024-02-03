package class21_02_FEB_Package;

import static java.lang.Math.sqrt;

// importing another package by * we can access all classes in that package 
import class_22_01_String2.Reverse_String_23_01;
import class_22_01_String2.StringPackageEx;

public class PackageExample {

	public static void main(String[] args) {

		Reverse_String_23_01 reverse = new Reverse_String_23_01(); // accessing the another by creating object
		reverse.display();

		StringPackageEx ex = new StringPackageEx();
		ex.msg();

		// directly accessing the class by packagename.classname
		class_22_01_String2.Stringpackage2 m = new class_22_01_String2.Stringpackage2();
		m.show();

		// accessing by importing static package ( java.util.math.*;)
		System.out.println(sqrt(7));

	}

}
