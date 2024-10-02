package javasessions;

import java.util.Arrays;

public class StaticArrayConcept 
{
		public static void main(String[] args) {
		int i[]=new int[4];
		i[0]=1;
		i[1]=2;
		i[2]=3;
		i[3]=4;
		 System.out.println(Arrays.toString(i));
		 
		 for(int k=0;k<i.length;k++)
		 {
			 System.out.println(i[k]);
		 }
		 
		 
		 System.out.println("-----------------------------------------");
		 for(int e:i)
		 {
			 System.out.println(e);
		 }
		 
//		 for(int e:i)
//		 {
//			 if(e%2==0)
//			 {
//				 System.out.println(e);
//			 }
//		 }
		 
		 int p[]=new int[4];
		 p[0]=10;
		 p[1]=20;
		 p[2]=30;
		 p[3]=40;
		 
		 int k;
		 for(k=p.length-1;k>=0;k--)
		 {
			 System.out.println(p[k]);
		 }
		
		 System.out.println("--------------------------------------------------");

		 int count=p.length-1;
		 for(int e:p)
		 {
			 e=p[count];
			 System.out.println(e);
			 count--;
		 }
	}

}
