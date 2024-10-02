package javasessions;

public class IncrementDecrementOperator {

	public static void main(String[] args)  
	{
		//++ and --
		//1.  Post Increment
		int a=1;
		int b=a++;  //Post Increment means whatever the original value of 'a',give it to 'b' then only increase the value of 'a' by 1 
		System.out.println("A: "+a);  //a=2
		System.out.println("B: "+b);  //b=1
		
		int c=-98;
		int d=c++;
		System.out.println("C :"+c);
		System.out.println("D :"+d);
		
		//2.  Pre Increment
		int e=1;
		int f=++e;		//Pre-Increment means first increase the value of e by 1 then give this increased value to f
		System.out.println("e is "+e);
		System.out.println("f is "+f);  //For pre-increment for such questions,instantly give the reply as 2 and 2 for both values.
		
		int g=-100;
		int h=++g;
		System.out.println("g is "+g);   
		System.out.println("h is "+h);
		
		int i=-48;
		int j=++i;
		System.out.println(i);
		System.out.println(j);
		
		//3.Post Decrement
		int k=2;
		int l=k--;   //In post decrement,the original value of k will be given to l,then only k gets decreased by 1 
		System.out.println("k is: "+k);   //1
		System.out.println("L is: "+l);	  //2
		
		int total=10;
		System.out.println(total++); //O/P:10,because here the consumer is syso and this 10 will be fed to println to print the value 10 
		System.out.println(total);   //11
		
		int fee=100;
		System.out.println(fee--);  //O/P:100
		System.out.println(fee);    //99
		
		//Pre-Decrement
		int v=2;
		int w=--v;
		System.out.println(w);    //1
		System.out.println(v);    //1
		
		int num=10;
		System.out.println(--num);  //9
		System.out.println(num);  //9
		
		
		 
		
		
		
		
		
		
		
		

	}

}
