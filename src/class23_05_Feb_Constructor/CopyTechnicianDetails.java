
/*
 * write a java program to copy details of a technician in a company to another 
 * technician.
 * 
 */
package class23_05_Feb_Constructor;

class Technician {
	String name;
	int employeeId;
	String specialization;

	// Constructor to initialize the attributes
	public Technician(String name, int employeeId, String specialization) {
		this.name = name;
		this.employeeId = employeeId;
		this.specialization = specialization;
	}

	// Method to display details
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Specialization: " + specialization);
	}

	// Method to copy details to another Technician object
	public void copyDetailsTo(Technician anotherTechnician) {
		anotherTechnician.name = this.name;
		anotherTechnician.employeeId = this.employeeId;
		anotherTechnician.specialization = this.specialization;
	}
}

public class CopyTechnicianDetails {
	public static void main(String[] args) {
		// Create the first technician
		Technician technician1 = new Technician("John Doe", 1001, "Network Security");

		// Display details of the first technician
		System.out.println("Details of Technician 1:");
		technician1.displayDetails();
		System.out.println();

		// Create the second technician
		Technician technician2 = new Technician("Alice Smith", 1002, "Database Administration");

		// Display details of the second technician before copying
		System.out.println("Details of Technician 2 (Before Copying):");
		technician2.displayDetails();
		System.out.println();

		// Copy details from the first technician to the second technician
		technician1.copyDetailsTo(technician2);

		// Display details of the second technician after copying
		System.out.println("Details of Technician 2 (After Copying):");
		technician2.displayDetails();
	}
}
