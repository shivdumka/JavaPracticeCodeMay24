package javasessions;

public class EmployeeSheet {
	public String getTitle()
	{
		System.out.println("www.google.com");
		return "google";
	}
	
	public void test(byte a)
	{
		System.out.println("Hi float");
	}
	
	public void test(short a)
	{
		System.out.println("Hi double");
	}
	public void test(long a)
	{
		System.out.println("Hi long");
	}
	public void test(char a)
	{
		System.out.println("Hi char");
	}
	
	//launchBrowser(String browserName)
	//browserName:chrome,firefox,safari,edge
	//return-print success message abd return boolean(true/false) 
	public boolean launchBrowser(String browserName)
	{
		boolean flag=true;
		switch(browserName.trim().toLowerCase())
		{
		case "chrome":
			System.out.println("Launch Chrome Browser");
			break;
		case "firefox":
			System.out.println("Launch firefox Browser");
			break;	
		case "safari":
			System.out.println("Launch safari Browser");
			break;
		case "edge":
			System.out.println("Launch edge Browser");
			break;
		default:
			System.out.println("Plz pass the correct browser name..."+browserName);
			flag=false;
		}
		return flag;
	}
	
	public static void main(String[] args)
	{
		EmployeeSheet e=new EmployeeSheet();
		boolean b=e.launchBrowser("FireFOx");
		System.out.println(b);
		if(b==true)
		{
			System.out.println("Success,browser launched");
		}
		else 
		{
			System.out.println("Incorrect browser,launch failed");
		}
		
		String n=e.getTitle();
		System.out.println(n);
		
		e.test(2000);
	}

}
