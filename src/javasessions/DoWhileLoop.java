package javasessions;

import java.util.Arrays;

public class DoWhileLoop {

	public static void main(String[] args) 
	{
		
		System.out.println(1%2);
		int a=1;
		do
		{
			System.out.println(a);
			a++;
		} 
		while(a<=10);
		
		int b=0;
		do 
		{
			if(b%2!=0) {
			System.out.println(b);
			}
			b++;
		}
			while(b<=100);


int[] n= {1,2,3,4};
System.out.println(Arrays.toString(n));
	}

}

