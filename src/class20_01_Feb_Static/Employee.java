// write a program  to create a class called "Employee" with a name job title  and salary attribute
// and methods to calculate and update salary

package class20_01_Feb_Static;

public class Employee {
	String name, job_title;
	int salary, years;

	int calculate(int s, int y) {
		salary = s;
		years = y;
		return s * 12;
	}

	int update(int s, int y) {
		int new_sal = (s * y) / 100 + s;
		return new_sal;
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.name = "Raju";
		employee.job_title = "Java developer";

		int salary, years;
		salary = 30000;
		years = 3;
		System.out.println(employee.calculate(salary, years));
		System.out.println(employee.update(salary, years));

	}

}
