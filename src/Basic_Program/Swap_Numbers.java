package Basic_Program;
import java.util.Scanner;
public class Swap_Numbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First numbers :");
		int x=sc.nextInt();
		System.out.println("Enter the First numbers: ");
		int y=sc.nextInt();
		 x=x+y;
		 y=x-y;
		 x=x-y;
		 System.out.println("After swapping the value of x:"+x+" After swapping the value of y:"+y);
	}

}
