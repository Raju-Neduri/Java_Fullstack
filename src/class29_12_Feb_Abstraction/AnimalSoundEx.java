/*
 * Write a Java program to create an abstract class Animal with an abstract method called
 *  sound(). Create subclasses Lion and Tiger that extend the Animal class and 
 *  implement the sound() method to make a specificsound for each animal
 */

package class29_12_Feb_Abstraction;

abstract class Animal1 {

	public abstract void sound();

}

class Lion extends Animal1 {
	public void sound() {
		System.out.println("Lion roars");

	}
}

class Tiger1 extends Animal1 {
	public void sound() {
		System.out.println("Tiger growls");

	}
}

public class AnimalSoundEx {

	public static void main(String[] args) {

		Lion l = new Lion();
		l.sound();

		Tiger1 t = new Tiger1();
		t.sound();
	}

}
