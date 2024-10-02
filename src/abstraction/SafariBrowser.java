package abstraction;

public class SafariBrowser implements WebDriver 
{

	public SafariBrowser()
	{
		System.out.println("launching Safari Browser");
	}
	
	@Override
	public void get(String url) 
	{
		System.out.println("enetering url: "+url);
	}

	@Override
	public String getTitle() 
	{
		return "Google";
	}

	@Override
	public void clickElement(String element)
	{
		System.out.println("Click on the element: "+element);
		
	}

	@Override
	public void sendKeys(String element, String value) 
	{
			System.out.println("Entering value:"+value+" "+"in the field:"+element);
	}


	@Override
	public void closeBrowser() 
	{
		System.out.println("Closing browser");
	}
	
	
}