
package class_26_12_IFelse;

import java.util.Scanner;

public class Grading_system {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		double marks=sc.nextDouble();
		
		if(marks>35 && marks<=55) {
			System.out.println("You got C grade");
		}
		else if(marks>50 && marks<=75) {
			System.out.println("You got B grade");
		}
		else if(marks>75 && marks<=90) {
			System.out.println("You got A grade");
		}
		else if(marks>90 && marks<=100) {
			System.out.println("You got A+ grade");
		}
		else if( marks<=35 && marks>=0) {
			System.out.println("You failed the exam");	
		}
		else {
			System.out.println("Please enter a valid number");
		}
	}
}
