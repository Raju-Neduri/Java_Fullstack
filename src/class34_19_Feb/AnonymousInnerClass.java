package class34_19_Feb;

abstract class Person {
	abstract void eat();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Person p = new Person() {
			public void eat() {
				System.out.println("I ate fruits");

			}
		};
		p.eat();

	}

}
