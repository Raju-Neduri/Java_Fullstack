package Basic_Program;

public class Narrowing_Typecasting {
	public static void main(String args[]) {
		long l=200;
		int i=(int)l;
	System.out.println("value of l="+l+ "; value of i="+i);
	
	int k=9;
	short s=(short)k;
	System.out.println("value of k="+k+ " value of s="+s);
	
	float f1=80.90f;
	long l1=(long)f1;
	System.out.println("value of l1="+l1+ " value of f1="+f1);
	 
	float f2=78.9f;
	int i1=(int)f2;
	System.out.println("Value of i1: "+i1 +" Value of f2:" +f2 );
	
	double d=7.8;
	float f=(float)d;
	System.out.println("value of f: "+f+" Value of d: "+d);

	}

}
