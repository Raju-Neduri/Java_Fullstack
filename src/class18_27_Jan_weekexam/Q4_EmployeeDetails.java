//Q4.Wap to accept employee details and print employee detail
package class18_27_Jan_weekexam;

public class Q4_EmployeeDetails {

	String name;
	int employeeId;
	double salary;

	void accept(String n, int id, double s) {
		name = n;
		employeeId = id;
		salary = s;

	}

	void display() {
		System.out.println("name:" + name + ", EmployeeId: " + employeeId + ", salary= " + salary);

	}

	public static void main(String[] args) {
		Q4_EmployeeDetails employee1 = new Q4_EmployeeDetails();
		Q4_EmployeeDetails employee2 = new Q4_EmployeeDetails();
		Q4_EmployeeDetails employee3 = new Q4_EmployeeDetails();

		employee1.accept("Ramu", 1, 25000);
		employee1.display();
		employee2.accept("Raju", 2, 26000);
		employee2.display();
		employee3.accept("Rama", 3, 28000);
		employee3.display();

	}

}
