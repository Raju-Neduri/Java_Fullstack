package classOjectsMethods;

public class StudentEx {
	String name;
	String email;
	long phone;
	static String institute;

	public static void main(String[] args) {
		StudentEx.institute = "St.Thomas E/M high School"; // static are access by class name.variable

		StudentEx raju = new StudentEx();
		raju.name = "Raju";
		raju.email = "rajneduri123@gmail.com";
		raju.phone = 9989712513L;
		StudentEx vaishu = new StudentEx();
		vaishu.name = "vaishu";
		vaishu.email = "rajneduri123@gmail.com";
		vaishu.phone = 9989712513L;

		System.out.println(raju.name + ", " + raju.email + ", " + raju.phone + ", " + institute);
		System.out.println(vaishu.name + ", " + vaishu.email + ", " + vaishu.phone + ", " + institute);

	}

}
