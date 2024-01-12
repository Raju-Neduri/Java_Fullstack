//write a program to calculate income tax.
package class_26_12_IFelse;

import java.util.Scanner;

public class Income_Tax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your income");
		double income=sc.nextDouble();
		double tax;
		
		if (income >= 300000 && income<=600000) {
			tax=(income*2)/100;
			System.out.println("Your income tax is :"+tax);
		}
		else if (income >= 600000 && income<=900000) {
			tax=(income*5)/100;
			System.out.println("Your income tax is :"+tax);
		}
		else if (income >= 900000 && income<=1200000) {
			tax=(income*7)/100;
			System.out.println("Your income tax is :"+tax);
		}
		else if (income >= 1200000 && income<=1500000) {
			tax=(income*9)/100;
			System.out.println("Your income tax is :"+tax);
		}
		else {
			System.out.println("No Tax");
		}

	}

}
