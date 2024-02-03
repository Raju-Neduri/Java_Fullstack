package class22_03_Feb;

import java.util.Scanner;

public class Employee {

	String name;
	String jobTitle;
	double salary;

	public void acceptInformation() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Name: ");
		this.name = scanner.nextLine();

		System.out.print("Enter Job Title: ");
		this.jobTitle = scanner.nextLine();

		System.out.print("Enter Salary: ");
		this.salary = scanner.nextDouble();
	}

	public void calculateSalaryIncrease(double percentage) {
		double increaseAmount = this.salary * (percentage / 100);
		this.salary += increaseAmount;
		System.out.println("\nSalary increased to RS " + String.format("%.2f", this.salary));
	}

	public void updateSalary(double newSalary) {
		this.salary = newSalary;
		System.out.println("\nSalary updated to Rs " + String.format("%.2f", this.salary));
	}

	public void displayInformation() {
		System.out.println("Employee Information:");
		System.out.println("\nName: " + name);
		System.out.println("Job Title: " + jobTitle);
		System.out.println("Salary: Rs " + String.format("%.2f", salary));
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee();

		emp1.acceptInformation();

		emp1.displayInformation();

		emp1.calculateSalaryIncrease(10); // 10%
		emp1.updateSalary(50000);

		emp1.displayInformation();
	}
}