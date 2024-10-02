package javasessions;

public class IfElseConcept {

	public static void main(String[] args) {

		// If code:
		int x = 2;
		if (x >= 5) {
			System.out.println(x);
		}

		// If else statement tests the condition,it executes the if block if condition
		// is TRUE,if condition is false else gets executed
		int a = 10;
		int b = 20;
		if (a > b) {
			System.out.println(a + " is greater than " + b + " ,therefore if part executes");
		} else {
			System.out.println(b + " is greater than " + a + " ,therefore else part executes");
		}

		// Concept of dead code:
		if (true) {
			System.out.println("Hii");
		}
//			else 
//			{
//				System.out.println("This is a dead code");   //Dead code is a piece of code that will never be executed
//			}

		// Nested IF-ELSE statement
		int marks = 1000;
		if (marks <= 100) {
			if (marks >= 95) {
				System.out.println("You've earned Grade A");
				if (marks == 100) {
					System.out.println("Yay,youre eligible for 100% scholarship,Congratulations");
				} else {
					System.out.println("Dont worry,still you'll be rewarded with 40% scholarship,great job");
				}
			}
		} else {
			System.out.println("Invalid Code");
		}

//		// IF-ELSE IF STATEMENT
//		String browser = "OPERA";
//		if (browser.equals("Chrome")) {
//			System.out.println("Chrome is launched");
//		} else if (browser.equals("Firefox")) {
//			System.out.println("Firefox is launched");
//		} else if (browser.equals("Edge")) {
//			System.out.println("Edge is launched");
//		} else if (browser.equals("IE")) {
//			System.out.println("IE is launched");
//		} else {
//			System.out.println("please launch the correct browser,as "+browser+ " is invalid");
//		}

		// above code can be optimized as performance issue is there in above code bcoz it will check each and every condition 
		//Using Switch Case we can increase the performance of our code rather than if-else if and if-else
		//Switch case will directly jump to the required key(here "browser") and execute the code by entirely coming out of the .....
		//.....entire switch case and ending the execution of the code.(It will not check all cases hence performance is boosted)
		//break is very much necessary bcoz switch case is a khula saand which will execute all the case when it wont see break
		
		String browser="chrome";
		switch (browser)				//Decision maker 
		{
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "firefox":
			System.out.println("Launch firefox");
			break;
		case "edge":
			System.out.println("Launch edge");
			break;	
		case "ie":
			System.out.println("Launch ie");
			break;
		default:
			System.out.println("please launch the correct browser,as "+browser+ " is invalid");
			break;
		}

		//Random Practice
		char ch[]=new char[5];
		ch[0]='a';
		ch[1]='e';
		ch[2]='i';
		ch[3]='o';
		ch[4]='u';
		int m=ch.length-1;
		for(int j=0;j<=m;j++)
		{
			System.out.println(ch[j]);
		}
		
		//print vowels
		char c='a';
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("character is vowel");
		}
		else {
			System.out.println("character is consonant");
		}
		char chh='i';
		switch(chh)
		{
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("consonant "+chh);
			break;
		}
	}
}
	
		//Syntax of switch case
////		switch(key)
////		{
////		case value:
//		break;
//		
//		default:
//			break;
////		}
	
	
	







