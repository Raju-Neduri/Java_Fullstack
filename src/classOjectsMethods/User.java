package classOjectsMethods;

public class User {
	int age = 20; // instance variable

	public static void main(String[] args) {
		User raju = new User();
		System.out.println(raju.age);

		User rani = new User();
		rani.age = 200;
		System.out.println(raju.age);
	}

}
