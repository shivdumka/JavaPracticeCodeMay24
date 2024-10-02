package javasessions;

import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		
		int i[]=new int[4];
		System.out.println("As we have asked to print before assigning values to variable i,therefore default values of int is: "+i[0]);
		
		System.out.println("------------------------------------------");  
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		
		
		System.out.println(i[1]);
		
		System.out.println("------------------------------------------");
		
		for(int j=0;j<i.length;j++)
		{
			System.out.println("Using For Loop: "+i[j]);
		}
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Using Arrays.toString: "+Arrays.toString(i));
		
		System.out.println(i[10]);   //index 10 is not present as range for above array is 0 to 3,therefore we get ARRAY INDEX OUT.....
									 //.......OF BOUNDS EXCEPTION
		
		
	}

}
