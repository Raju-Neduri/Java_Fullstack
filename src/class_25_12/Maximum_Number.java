// write a program to print max number between two numbers.
	
package class_25_12;

import java.util.Scanner;

public class Maximum_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first number");
		int num1=sc.nextInt();
		
		System.out.println("enter the Second number");
		int num2=sc.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is greater than "+num2);
		}
		else {
			System.out.println(num1+" is less than "+num2);
		}
	}

}
