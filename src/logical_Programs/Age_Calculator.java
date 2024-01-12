package logical_Programs;
import java.util.Scanner;
public class Age_Calculator {
	public static void main(String[] args) {
		int year,age,current_year=2023;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the birth year: ");
		year=sc.nextInt();
		
		age=current_year-year;
		System.out.println("Age= "+age);
		
		
	}
}
