package exceptionHandling;

public class StudentStackOverflowErrorHandling {

	public void m1()
	{
		System.out.println("m1");
		m2();
	
	}

	public void m2()
	{
		System.out.println("m2");
		m1();
		
	}
	public static void main(String[] args)
	{
		System.out.println("Hi!!!!!!!!!!!");
		StudentStackOverflowErrorHandling s=new StudentStackOverflowErrorHandling();
		try {
			s.m1();
			}
			catch(StackOverflowError s1)
			{
				System.out.println("Error is coming ");
			}
		System.out.println("Bye,continued program execution");

	}

}
