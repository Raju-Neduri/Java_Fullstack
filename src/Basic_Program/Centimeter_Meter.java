package Basic_Program;
import java.util.Scanner;
public class Centimeter_Meter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double  m,cm,mm;
		System.out.println("Enter the value of meter:");
		m=sc.nextDouble();
		cm=m*100;
		mm=m*1000;
		System.out.println("m to cm= "+cm);
		System.out.println("m to mm= "+mm);
		
	}

}
