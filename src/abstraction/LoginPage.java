package abstraction;

public class LoginPage extends Page {
	
	

	public LoginPage() 
	{	
		System.out.println("Child Class default Constructor");
	}
	
	public LoginPage(int a) 
	{
		super(20);
		System.out.println("Child Class Parameterized Constructo "+a);
		
	}

	
	
	@Override
	public void title() 
	{
		System.out.println("Login page title");
		
	}

	@Override
	public void url() 
	{
		System.out.println("Login Page url");
		
	}
	
	//Individual Method of LoginPage
	public void doLogin()
	{
		System.out.println("Login successful");
	}

}
