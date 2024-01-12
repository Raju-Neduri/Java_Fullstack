package Basic_Program;

import java.util.Scanner;

public class Simple_interest {

	public static void main(String[] args) {
		int t;
	    double p,r,si;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the principal amount");
	    p=sc.nextDouble();
	   
	    System.out.println("Enter the rate of interest ");
	    r=sc.nextDouble();
	   
	    System.out.println("Enter the Duration amount");
	    t=sc.nextInt();
	    
	    si=(p*t*r)/100;
	    System.out.println("Simple interest="+ si);
	   
	}

}
