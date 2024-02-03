//write a program  to create a class called "Employee" with a name, job title, and salary attributes and 
//methods to calculate and update salary without using constructors

package class22_03_Feb;

import java.util.Scanner;

public class Employee {

	String name;
	String jobTitle;
	static double salary;

	public void acceptInformation() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Name: ");
		this.name = scanner.nextLine();

		System.out.print("Enter Job Title: ");
		this.jobTitle = scanner.nextLine();

		System.out.print("Enter Salary: ");
		this.salary = scanner.nextDouble();
	}

	public void displayInformation() {
		System.out.println("Updated salary :" + salary);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.acceptInformation();

		Scanner sc = new Scanner(System.in);
		System.out.println("Increased amount of salary");
		double increment = sc.nextDouble();

		salary += increment;
		emp.displayInformation();

	}
}