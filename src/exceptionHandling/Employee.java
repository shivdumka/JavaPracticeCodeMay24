package exceptionHandling;

public class Employee {
	String name;
	public static void main(String[] args) 
	{	
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		
		try
		{	
			int i=9/0;
			System.out.println(i);
			Employee e=new Employee();
			e=null;
			e.name="Shivam";
		}
		
//		
//		try 
//		{
//		Employee e=new Employee();
//		e=null;
//		e.name="Shivam";
//		}
		catch(NullPointerException n) 
		{
			System.out.println("NPE is coming "+n);
			n.printStackTrace();
		}
		catch(RuntimeException e)
		{
		System.out.println("RE is coming "+ e);
			e.printStackTrace();
		}
		
		System.out.println("hello");

	}

}
