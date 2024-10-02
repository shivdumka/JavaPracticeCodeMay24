package stringManipulations;

import java.util.Arrays;

public class ReverseString {
      
	public static String reverse(String st)
	{
		if(st==null)
		{
			throw new RuntimeException("Value cant be null");
		}
		
		else if(st.length()==1 || st.length()==0)
		{
			return st;
		}
		else 
		{
			String sh="";
			for(int i=st.length()-1;i>=0;i--)
			{
				sh=sh+st.charAt(i);
			}
			return sh;
	
		}
		
		
	}

	
	
	
	public static void main(String[] args) {
		
		String s="";
		String sb=ReverseString.reverse(s);
		System.out.println(sb);
	
		Integer a=new Integer(9);
		int n=a;
		System.out.println(n);
	
		String sp="20";
		Byte b=Byte.parseByte(sp);
		System.out.println(b-100);
		byte kl=Byte.MAX_VALUE;
		System.out.println(kl);
		
		Integer i=10;
		byte bn=i.byteValue();
	
		Double de=12.33;
		String gh=String.valueOf(de);
		System.out.println(gh+12.33);
		
		
		boolean bk=false;
		String sl=String.valueOf(bk);
		System.out.println(sl+78);
		
		char c[]= {'j','a','v','a'};
		String sj=String.valueOf(c);
		System.out.println(sj);
		
		int ib[]= {1,2,3};
		String hn=String.valueOf(ib);
		System.out.println(hn);
		
		Integer m=90;
		int r=m.intValue();
		System.out.println(r);
		
		String mos="I love \"java\" code";
		mos="I love \"java\"\\ code";
		System.out.println(mos);
		
		String gji="Shivam.Dumka.8979879788.Nainital.India";
		String hu[]=gji.split("\\.");
		System.out.println(Arrays.toString(hu));
		
		int ko=9;
		Integer o=Integer.valueOf(ko);
		System.out.println(o);
		
		Integer nnew =10;
				//nnew.
		String sew=String.valueOf(nnew);
		
		int mim=01;
		System.out.println(mim);
		
	}

}
