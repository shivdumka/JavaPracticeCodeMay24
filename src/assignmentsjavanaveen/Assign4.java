package assignmentsjavanaveen;

public class Assign4 {
	
	static int wheel=4;

	public static void main(String[] args)
	{
//		1. WAP to print following output:
//
//			 
//
//			I am Batman﻿
//
//			I am Batman﻿
//
//			I am Batman﻿
//
//			I am Batman
//
//			I am Batman
	
		String s="I am Batman";
		for (int i=1;i<=5;i++)
		{
			System.out.println(s);
		}
		
//		2. WAP to print following output:
//
//			I am Batman 1
//
//			I am Batman 2
//
//			I am Batman 3
//
//			I am Batman 4
//
//			I am Batman 5
//
//			I am Batman 6
//
//			I am Batman 7
//
//			I am Batman 8
//
//			I am Batman 9
		
		System.out.println("-----------------------------------------------------------------------------");
		String t="I am Batman";
		for(int i=1;i<10;i++)
		{
			System.out.println(t+" "+ i);
		}
System.out.println("---------------------------------------------------------------------");

//3.WAP to print 10 to 1 using for, while and do-while loop
	
		//while loop
		int i=10;
		while(i>0)
		{
			System.out.println(i);
			i--;
		}
		//do while loop
	    System.out.println("------------------------------------------------------------------------------");
	    int j=10;
		do 
		{
			System.out.println(j);
			j--;
		}
		while(j>0);
		
//4.Write a program in Java to print "Hello World" ten times using while loop
		String o="Hello World";
		int f=1;;
		while(f<=10)
		{
			System.out.println(o);
			f++;
		}
		
//5.Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
		int g=1;
		while(g<=100)
		{
			if(g%5==0)
			{
				System.out.println(g);	
			}
			g++;
		}
		//for loop
		for(int aa=1;aa<=100;aa++)
		{
			if(aa%5==0)
			{
				System.out.println(aa);
			}
		}
		System.out.println("------------------yjdjshdkjasdhkjjhasdkajdsadsasdasd------------------------------------");
		//do-while loop
		int d=1;
		do
		{
			if(d%5==0)
			{
			System.out.println(d);
			}
			d++;
		}
		while(d<=100);

		
//6.From 1 to 100, print "ping" if multiple of 3, "pong" if multiple of 5, or else print the number
		System.out.println("======================================================================================================");
		int p=1;
		while(p<=100)
		{
			if(p%3==0)
			{
				System.out.println(p+" "+"ping");
			}
			else if(p%5==0)
			{
				System.out.println(p+" "+"pong");
			}
			else
				System.out.println(p);
			p++;
		}
		
//7.Print all odd and even numbers between 1 to 100
		System.out.println("-------------------------------------------------------------------------------------------------------");
		for(int a=1;a<=100;a++)
		{
			if(a%2==0)
			{
			System.out.println(a);
			if(a!=100)														//otherwise 101 will be printed, as 100/2 is true and a+1
			{																//will also execute
			System.out.println(a+1);
			}
			}

		}
//8.output is infinite loop of below code therefore commented
//		int h=1;
//		while(h<=1)
//		{
//			System.out.println("Hello Java");
//	}
//9. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
		char b='A';
		while(b<='Z')
		{
			System.out.println(b+"'s Ascii number is:" +(int)b);
			b++;
		}
		
		char c='a';
		while(c<='z')
		{
			System.out.println(c+"'s ascii number is:"+(int)c);
			c++;
		}
		char e='1';
		while(e<='9')
		{
			System.out.println(e+"'s ascii number is"+(int)e);
			e++;
		}
		System.out.println("------------------------------------------------------------------------------------------------------------");
	
		for(char q='A';q<='Z';q++)
		{
			System.out.println(q+"'s ascii number is"+(int)q);
		}
		
		System.out.println("-------------------------------------------------------------------------------------------------------");
		for(char r='a';r<='z';r++)
		{
			System.out.println(r+"'s ascii number is:"+(int)r);
		}
		
		System.out.println("--------------------------------------------------------------------------------------------------------");
		for(char ss='1';ss<='9';ss++)
		{
			System.out.println(ss+"'s ascii number is"+(int)ss);
		}
	
//10.Even Numbers Series: Write a Java program to print the series of even numbers from 2 to 100.
	
		System.out.println("---------------------------------------------------------------------------------------------------------");
		for(int pp=2;pp<=100;)
	{
		System.out.println(pp);
		pp=pp+2;
	}
		int uu=2;
		while(uu<=100)
		{
			if(uu%2==0) 
			{
			System.out.println(uu);
			}
			uu++;
		}
		System.out.println("---------------------<<<<<<<>>>>>>>>-----------------------------------------------------------------------");
//	11	Reverse Alphabet Series: Develop a Java program to print the series of lowercase alphabets in reverse order from 'z' to 'a'.
		for(char vv=122;vv>=97;vv--)
		{
			System.out.println(vv);
		}	
		
		System.out.println("------------------------------------------------------------------------------------------------------");
//	12	Floating Point Series: Write a Java program to print the series of floating-point numbers from 1.0 to 10.0.
		for(float ff=1.0f;ff<=100.0f;ff++)
		{
			System.out.println(ff);
		}
		
		char yv='z';
		while(yv>='a')
		{
			System.out.println(yv);
			yv--;
		}
//	13	Multiples of 9 Series: Develop a Java program to print the series of numbers where
//		each number is a multiple of 9, starting from 0 and ending at 99.
		for(int nb=0;nb<=100;nb++)
		{
			if(nb%9==0)
			{
				System.out.println(nb);
			}
		}
		
//Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		for(char io='a';io<='z';io++)
		{
			if(io=='a' || io=='e'||io=='i'||io=='o'||io=='u') 
			{
				System.out.println(io);
			}
		}
		char id='a';
		while(id<='z')
		{
			if(id=='a' || id=='e'||id=='i'||id=='o'||id=='u') 
			{
				System.out.println(id);
			}
			id++;
		}
//Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		int br=1;
		for(br=1;br<=10;br++)
		{
			System.out.println(br);
			if(br%7==0)
			{
				System.out.println("bye,see you tomorrow");
				break;
			}
		}
	}
	
}
	


