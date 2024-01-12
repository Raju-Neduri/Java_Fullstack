package class_25_12;

import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		
		if(num>0){
			System.out.println("Positive number");
		}
		else if( num<0)
		{
			System.out.println("Negative number");
		}
		else
		{
			System.out.println("zero");
		}
	}

}
