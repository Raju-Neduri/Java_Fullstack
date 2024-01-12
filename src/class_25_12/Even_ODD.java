// write a Program to Check Whether a Number is Even or Odd using if else

package class_25_12;

import java.util.Scanner;

public class Even_ODD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num +" is an even number");
		}
		else
		System.out.println(num +" is an odd number");
		
	}

}
