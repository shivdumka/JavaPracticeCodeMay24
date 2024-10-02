package assignmentsjavanaveen;

public class Assign1 {

	public static void main(String[] args) 
	{
		//Assign1:Print two strings by concatenation
			String st1="Hello";
			String st2="Shivam D";
			System.out.println(st1+" "+st2);
			
		//Assign2:Print addition of two number 74+35=110	
			byte a=74;
			byte b=36;
			int c=a+b;
			System.out.println(c);
			
		//Assign3:Write a Java program to print the division of two numbers. 50/3=16
			byte d=50;
			byte e=3;
			int f=d/e;
			System.out.println(f);
		
		//Assign4:Write a Java program to compute the specified expressions and print the output. Go to the editor.
				//Test Data:
				//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
				//Expected Output
				//2.138888888888889
			float g=25.5f;
			float h=3.5f;
			float i=40.5f;
			float j=4.5f;
			double k=(g*h-h*h)/(i-j);
			System.out.println(k);
			
		//Assign5:Try to concat "Hello Selenium" with a character 't'.	
			String str="Hello Selenium ";
			System.out.println(str+'t');
		
		//Assign6:Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
		//"Your Total  amount is: 3700".
			int l=100;
			int m=200;
			int n=3400;
			int o=l+m+n;
			System.out.println("Your total amount is: "+o);
			
		//Assign7:Print the ASCII value of the character 'h'.
			char hh='h';
			System.out.println((byte)hh);
		//Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character
			char dd='d';
			System.out.println((char)(dd+3));
			
		//Write a program to find the square of the number 3.9.
			float num=3.9f;
			System.out.println(Math.pow(num, 2));
			
			
			
	}

}
