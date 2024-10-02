package javasessions;

public class LoopsConcept {

	public static void main(String[] args) 
	{
		//In while loop,loop starts with checking the condition,executing the statement inside the loop until the condition is true
		//as soon as the condition is false,it will come out of the loop body and end the execution.
//		int i=1;
//		while(i<=10)   
//		{				
//			System.out.println(i);    //1 2 3 4 5 6 7 8 9 10
//			i++;
//		}
//		
//		//Infinite while loop as increment/decrement operator is not specified
////		int k=1;
////		while(k<=50)
////		{
////			System.out.println(k);
//////			k++;     //Now code is finite and correct
////		}
//	
//		int l=10;
//		while(l>0)
//		{
//			System.out.println(l);
//			l--;
//		}
//		 
//
//		 
//		for(char ch='a';ch<='z';ch++)
//		{
//			System.out.println((byte)ch);
//		}
//		
//		for(double d=1.3;d<=67.77;d++)        
//		{
//			System.out.println(d);
//		}
//		
////		for(int ij=0;ij<=100;ij++)
////		{
////			if(ij%2==0)
////			{
////				System.out.println(ij);
////			}
////		}
////		
////		//even number while loop
//		int g=1;
//		while(g<=100)
//		{
//			if(g%2==0)
//			{
//				System.out.println(g);
//				
//			}
//			g++;
//		}
//		for(;;)
//		{
//			System.out.println("test");
//		}
//		
		
		int y=1;
		while(y<=10)
		{
			++y;
			System.out.println(y);
		}
		
//		byte b=1;
//		while(true)
//		{
//			System.out.println(b);
//			b++;
//		}
		int n=1;
		while(n<=5)
		{
			int m=n++;
			System.out.println(m); //1223344556
			System.out.println(n);//
		}
 
		for(int u=1;u<=10;u++)
		{
			System.out.println(u);
		}
		
		int s=1;
		while(true)
		{
			if(s==10)
			{
			System.out.println(s);
			break;
			}
			s++;
		}
	}

}
