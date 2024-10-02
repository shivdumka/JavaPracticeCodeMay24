package stringManipulations;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args)
	{
		String str="Hello this is Shivam calling you from India";
		System.out.println(str.length());
		//System.out.println(str.charAt(-1));
		System.out.println(str.indexOf("Shivam"));
		System.out.println(str.indexOf('i'));
		System.out.println(str.indexOf('z'));
		System.out.println(str.indexOf('i'));			//1st occurence of i
		System.out.println(str.indexOf('i',str.indexOf('i')+1));			//2nd occurence of i
		System.out.println(str.indexOf('i', str.indexOf('i',str.indexOf('i')+1)+1));	//3rd occurence of i
		int p=str.indexOf('i', str.indexOf('i',str.indexOf('i')+1)+1);
		System.out.println(str.indexOf('i', p+1));
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i',str.indexOf('i')+1)+1)+1));
		System.out.println(str.indexOf("Inhia"));	//-1 will be the O/P
		
		System.out.println(str.contains("you"));
		
		
		
		char ch[]= {'j','a','v','a'};
		String sch=new String(ch);
		System.out.println(sch);
		
		String su="Welcome Java";
		if(su.indexOf("java")==8)
		{
			System.out.println();
		}
		
		String g="01-01-1999";
		String gg=g.replace('-','/');
		System.out.println(gg);
		
		String str1="I love Nainital";
		System.out.println(str1.contains("Nainital"));
		String st[]=str.split("i");
		System.out.println(st[1]);
		
		String str2="Java_Python_Ruby_Javascript";
		String str3[]=str2.split("_");
		System.out.println(Arrays.toString(str3));
		
		String ghu="xXSeleniumXxXJavaxXXisXxXcoolxX";
		String ghu1[]=ghu.split("xX");
		System.out.println(Arrays.toString(ghu1));
		System.out.println(ghu1.length);
			
		String sh="Shivam";
		for(int ii=sh.length()-1;ii>=0;ii--)
		{
			char sm=sh.charAt(ii);
			System.out.print(sm);
			
		}
		
		
	}

}
