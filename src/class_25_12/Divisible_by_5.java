package class_25_12;

import java.util.Scanner;

//Write a program to check the number is  divisible by 5
public class Divisible_by_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(num%5==0) {
			System.out.println("given number is divisble by 5");
			
		}
		else
			System.out.println("Given number is not divisble by 5");
	}

}
