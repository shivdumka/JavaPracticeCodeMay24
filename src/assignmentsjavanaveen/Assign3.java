package assignmentsjavanaveen;

public class Assign3 {

	public static void main(String[] args) {
//1.Create variables of different data types such as int, float, double, etc. Assign values to them and then cast them to a higher 
//data type. Finally, print out the original and casted values to observe widening casting in action.

		int i=10;
		float f=20.03f;
		double d=123.345;
		
		
		double dc=i;
		double ff=f;
		
		System.out.println("original int value:"+i);
		System.out.println("widened int value to double:"+dc);
		System.out.println("original float value:"+f);
		System.out.println("widened float value to double:"+ff);
		
//		long l=i;
//		System.out.println(l);
//		int j=(int)l;
//		System.out.println(j);
//		
//		double d1=f;
//		System.out.println(d1);
//		float f1=(float)d1;
//		System.out.println(f1);
		
		System.out.println("----------------------------------------------------------------------------------");
// 2.Declare variables of higher data types like double, float, long, etc., and assign values to them. 
//Then, cast these variables to lower data types like int, short, byte, etc. Print out the original 
//and casted values to observe narrowing casting in action.
		double d4=78.33;
		float f4=32.3f;
		long l4=123221;
		
		int i4=(int)d4;
		short s4=(short)f4;
		byte b4=(byte)l4;
		
		System.out.println("Narrow Casted value from double to int:"+i4+"  "+"Original double value:"+d4);
		System.out.println("Narrow Casted value from float to short:"+s4+"  "+"Original short value:"+f4);
		System.out.println("Narrow Casted value from long to byte:"+b4+"  "+"Original long value:"+l4);
		
//		Q1.a : Find out the greatest number out of three different given numbers:
//
//			Input the 1st number: 25 
//
//			Input the 2nd number: 78 
//
//			Input the 3rd number: 87
//
//			Expected Output :
//
//			The greatest﻿: 87
		
		System.out.println("--------------------------------------------------------------");
		int x=25;
		int y=78;
		int z=87;
		if(x>y && x>z)
		{
			System.out.println("greatest number is :"+x);
		}
		else if(y>z && y>x)
		{
			System.out.println("greatest number is :"+y);
		}
		else
			System.out.println("greatest number is :"+z);
//		
		
		System.out.println("-------------------------------------------------");
//		2. Write a Java program to test a number is positive or negative.
//
//		Test Data
//
//		Input number: 35 -- positive number
//
//		Input number: -11 -- negative number

		int t=35;
		int u=-11;
		if(t>=0)
		{
			System.out.println("Input number: " +t+" -- positive number");
		}
		else 
		{
			System.out.println("Negative number");
		}
		if(u>=0)
		{
			System.out.println("Input number: "+u+" -- positive number");
		}
		else
		{
			System.out.println("Input number: " +u+" -- negative number");
		}
		
//3.WAP to check number is odd or even using If - Else
		int v=101;
		if(v%2==0)
		{
			System.out.println("even  number:"+v);
		}
		else 
		{
			System.out.println("odd number:"+v);
		}
//4.WAP to check given alphabet character is Vowel or Consonant using Switch - Case	
		System.out.println("----------------------------------------------");
		
		char w='a';
		switch(w)
		{
		case 'a':
			System.out.println("vowel:"+w);
			break;
		case 'e':
			System.out.println("vowel:"+w);
			break;	
		case 'i':
			System.out.println("vowel:"+w);
			break;
		case 'o':
			System.out.println("vowel"+w);
			break;	
		case 'u':
			System.out.println("vowel"+w);
			break;
		default:
			System.out.println("Its a consonant:"+w);
			break;
		}
		
//5.WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
		System.out.println("--------------------------------------------------------------");
		
		String env="QA";
		switch(env) 
		{
		case "QA":
			System.out.println("QA environment opened");
			break;
		case "Stage":
			System.out.println("Stage environment opened");
			break;	
		case "Dev":
			System.out.println("Dev environment opened");
			break;	
		case "UAT":
			System.out.println("UAT environment opened");
			break;
		case "Prod":
			System.out.println("Prod environment opened");
			break;	
		default:
			System.out.println("Invalid environment");
			break;
			
		}
		
//		WAP to book the specific type of car from the Uber app using Switch - Case. 
//
//		a.Car Type: Mini, Sedan, SUV, Premium
//
//		b.If user passes wrong car type, print please select the right car type
		System.out.println("------------------------------------------------------------");
		
		String car="Mini";
		switch(car.toLowerCase().trim())
		{
		case "mini":
			System.out.println("Book Mini");
			break;
		case "Sedan":
			System.out.println("Book Sedan");
			break;
		case "SUV":
			System.out.println("Book SUV");
			break;
		case "Premium":
			System.out.println("Book Premium");
			break;
		default:
			System.out.println("please select the right car type");
			break;
		}
		
//		WAP to define the interest rate on the basis of Loan type using Switch Case
//
//		a.Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
//
//		b.For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan
		
		System.out.println("------------------------------------------------------------------------");
		
		String loanType="  Housing Loan";
		int salary=35999;
		switch(loanType.trim())    //Why toLowerCase() method is not working,its directly bjumping tp default statement!!!
		{
		case "Housing Loan":
			
			if(salary<35000)
			{
				System.out.println("NOT APPLICABLE FOR Housing Loan");
			}
			else
			System.out.println("Interest rate is 19%");
			break;
		case "Car Loan":
		System.out.println("Interest rate is 10%");
			break;
		case "Personal Loan":
			System.out.println("Interest rate is 8%");
				break;
		case "Education Loan":
			System.out.println("Interest rate is 6%");
				break;		
		default:
			System.out.println("Invalid Loan type");
			break;
		}
	}

}
