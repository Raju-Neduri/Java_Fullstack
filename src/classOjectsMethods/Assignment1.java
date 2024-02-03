// 1. write a program to accept and display the information of a person
package classOjectsMethods;

import java.util.Scanner;

public class Assignment1 {
	String name;
	int age;
	String address;

	public void accept() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Name: ");
		this.name = sc.nextLine();

		System.out.print("Enter Age: ");
		this.age = sc.nextInt();
		sc.nextLine(); // Consume the newline character

		System.out.print("Enter Address: ");
		this.address = sc.nextLine();
	}

	public void displayInformation() {
		System.out.println("Person Information:");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
	}

	public static void main(String[] args) {
		Assignment1 assignment = new Assignment1();
		assignment.accept();
		assignment.displayInformation();

	}

}
