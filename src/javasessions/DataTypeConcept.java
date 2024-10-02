package javasessions;

public class DataTypeConcept {

	public static void main(String[] args)
	{
		byte b=-128;
		System.out.println("Value of b is="+b);
		byte c=127;
		System.out.println("Value of c is="+c);
		short sh=1234;
		System.out.println(sh);
		 
		int i=10000000;
		System.out.println(i);
		
		long l=1999939232393292l; //we have to explicitly tell the compiler that the value entered is long,so put suffix 'l' at the end.
		long m=123123132;
		System.out.println(l);
		System.out.println(m);
		
	//	float k=12.3323423f;         //1st way to define float values with f/F as suffix
		float n=(float)12.3345345345334534123132123123;  //upto 6 digits of precision
		System.out.println(n);
		double j=10000000;
		double o=31231233.32347623846238746287374623487628346287346;
		System.out.println(o);
		System.out.println("--------------------------------------");
		System.out.println(j+o); 
		
		char ch='a';
		System.out.println(ch);
		//char ch1='aa';   only one digit is allowed
		char ch2='1';
		char ch3='$';
		char ch4=20;   //we can write in this way as 97 is an ASCII value and value of 97 as per ascii table is 'a'
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		char ch5='t';
		System.out.println(ch5+10);  //o/p is 126
		
		byte x=12;
		byte y=13;
		int z=x+y;
		System.out.println(z);
	}
}
