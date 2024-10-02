package assignmentsjavanaveen;

public class Assign2 {
	
	

	public static void main(String[] args) 
	{
		//Find Output 1:
		int ii = 11;

		ii = ii++ + ++ii;	//in first ii++ the value will be 11 but when fed to ++ii it will be already 12,and preincrement....
							//ii means its 13,therefore,11+13=24

		System.out.println(ii);		//24	
		
		//Find Output 2:
		int a=11, b=22, c;
		c = a + b + a++ + b++ + ++a + ++b;   //11+22+11+22+13+24=103
		
		System.out.println("a="+a);  //13
		System.out.println("b="+b);	 //24
		System.out.println("c="+c);  //103
		
		//find output 3:
		int i=0;
		int j = i++ - --i + ++i - i--;    //0-0+1-1=0
		System.out.println(j);
		
		//find error in code:
		boolean bb = true;
		//bb++;   //cannot use bb++ for boolean value
		System.out.println(bb);
		
		//find output 4:
		int u=1, v=2, w=3;
		int m = u-- - v-- - w--;     //1-2-3=-4
		System.out.println("u="+u);  //0

		System.out.println("v="+v);  //1

		System.out.println("w="+w);  //2

		System.out.println("m="+m);  //-4
		
		//Find Output 5:
		int aa=1, cb=2; 
		System.out.println(--cb - ++aa + ++cb - --aa);		//1-2+2-1=0
		
		//Find Output 6:
		int q=19, r=29, s=0;
		int t = q-- - r-- - s--;	//19-29-0=-10
		System.out.println("q="+q);		//18

		System.out.println("r="+r);     //28

		System.out.println("s="+s);		//-1
		
		System.out.println("t"+t);      //-10
		
		//What is wrong with this code,why compilation error?
		//int x = 11;
		//int zz =--(x++);
		
		//Find output 7:
		int mp = 0, np = 0;
		int pq = --mp * --np * np-- * mp--;		//-1*-1*-1*-1=
		System.out.println(pq);	  //1
		System.out.println(mp);	  //-2
		System.out.println(np);   //-2
		
		//find output 8:
		int aq=1;
		int tq = aq++ + ++aq * --aq - aq--;    //1+3*2-2=5
		System.out.println(tq);    //5
		System.out.println(aq);    //1
		
		//find output 9:
		//int aw = 11++;				//increment/decrement cannot be directly applied to the integers,only variable possess that power,ahahaa
		//System.out.println(aw);
		
		//Find Output 10
		int ch2 = 'A';
		System.out.println(++ch2);   //65
		System.out.println(ch2++);
		System.out.println(ch2);     //66
		
		System.out.println("----------------------------------");
		
		//Find Output 11
		char ch1 = 'A';
        System.out.println(++ch1);    //B
        
        //Find Output 12
        double d = 1.5, D = 2.5;
        System.out.println(d++ + ++D);    //1.5+3.5=5.0
        
      

        
		
	
	}

}
