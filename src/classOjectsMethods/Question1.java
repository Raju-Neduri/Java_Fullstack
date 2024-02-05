//Question 1: Basic Class Creation
//
//Create a class named Person with attributes name and age. Include a method introduce 
//that prints a greeting including the person's name and age.

package classOjectsMethods;

class Person {
	String name;
	int age;

	void introduce(String n, int a) {
		name = n;
		age = 22;
		System.out.println("Hello " + name + " welcome your age is:" + age);

	}

}

public class Question1 {

	public static void main(String[] args) {

		Person p = new Person();
		p.introduce("Surya", 22);
	}

}
