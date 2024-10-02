package javasessions;

public class MethodChaining {

	public void m1()
	{
		System.out.println("m1 method");  //m1 method
		m2();							  
	}
	public void m2()
	{
		System.out.println("m2 method"); //m2 method
		m3();
	}
	public void m3()
	{
		System.out.println("m3 method"); //m3 method
		MethodChaining.t1();
	}
	public static void t1()
	{
		System.out.println("t1 method"); //t1 method
		t2();
	}
	public static void t2()
	{
		System.out.println("t2 method"); //t2 method
		t3();
	}
	public static void t3()
	{
		System.out.println("t3 method"); //t3 method
//		MethodChaining call=new MethodChaining();
//		call.m1();
	}
	
	public static void main(String[] args) 
	{
		MethodChaining call=new MethodChaining();
		call.m1(); 

	}

}
