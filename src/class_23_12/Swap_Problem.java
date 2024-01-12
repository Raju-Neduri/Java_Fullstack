package class_23_12;

import java.util.Scanner;

public class Swap_Problem {

	public static void main(String[] args) {
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Value of first number ");
		x=sc.nextInt();
		
		System.out.println("Enter the Value of Second number ");
		y=sc.nextInt();
		System.out.println("Before swapping the value of x="+ x +", the value of y="+y);
		
		z=x;
		x=y;
		y=z;
		System.out.println("After swapping the value of x="+ x +", the value of y="+y);
		
	}

}
