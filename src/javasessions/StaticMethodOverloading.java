package javasessions;

public class StaticMethodOverloading {

	public void getMail() 
	{
		System.out.println("get mail");
	}
	public void sendMail()
	{
		System.out.println("send Mail empty");
	}
	public static void sendMail(String a)
	{
		System.out.println("send Mail string");
	}
	public static void sendMail(int a)
	{
		System.out.println("send Mail int");
	}
	public void sendMail(int a,String b)
	{
		System.out.println("send Mail int string");
	}
	
	public static void main(String[] args) 
	{
		StaticMethodOverloading t=new StaticMethodOverloading();
		t.sendMail();
		t.sendMail(10, "Shivam");
		System.out.println();
		
		t.sendMail(0, null);
	}

}
