package Basic_Program;
import java.util.Scanner;
public class Reminder_Quoitent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int qu;
		double num1, num2, rem;
		System.out.println("Enter the value of Divisor:");
		num1=sc.nextDouble();
		
		System.out.println("Enter the value of Dividend :");
		num2=sc.nextDouble();
		
		qu=(int) (num1/num2);
		rem= num1%num2;
		
		System.out.println("Value of reminder of two values="+ rem);
		System.out.println("Value of Quoitent of two values="+ qu);
		
	}

}
