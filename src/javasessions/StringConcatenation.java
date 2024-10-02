package javasessions;

public class StringConcatenation 
{

	public static void main(String[] args) 
	{
		//STring is class:default class
		//String is a non primitive data type as well
		//String represents a sequence of multiple characters
		
		String s="This is a String Class";
		String n="14234232 is %^%%^ BHHBJH";
		String X="Hello";
		String Y="Selenium";
		int a=10;
		int b=20;
		double c=12.33;
		double d=12.34;
		System.out.println(a+b); //30
		System.out.println(X+Y);  //HelloSelenium
		System.out.println(a+b+X+Y);//30HelloSelenium
		System.out.println(X+Y+a+b); //HelloSelenium1020
		System.out.println(a+X+b+Y);//10Hello20Selenium
		System.out.println(X+Y+(a+b)); //HelloSelenium30
		System.out.println(X+Y+a+b+c+d); //HelloSelenium102012.3312.44
		System.out.println(X+Y+(a+b+c+d)); //HelloSelenium54.77
		
		char ch='a';
		char ch1='a';
		char ch2='b';
		System.out.println(ch);
		System.out.println(ch1+ch2);
		System.out.println(ch1-ch2);
		System.out.println(ch2-ch1);
		System.out.println("-----------------------------------------------");	
		System.out.println((byte)'?');
		System.out.println(ch1+ch2+'0'+'A');
		System.out.println(n);
		System.out.println(s); 
		//how to print ASCII value of certain character?
		//ASCII values are numeric values so byte,short,int,long can represent the numeric ASCII values
		char ct='*';
		System.out.println((byte)'$');
		
		System.out.println('a'+20);
		System.out.println("Shivam"+(char)36);
		
		System.out.println('a'+'c'+'0'+'9'+'A'+"Hello"+'a'+'b');
		
		
		
		
	}

}
