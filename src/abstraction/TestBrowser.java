package abstraction;



public class TestBrowser {

	public static void main(String[] args) 
	{
		
		//We'll have to initialize the browser by passing a line as a comment in default constructor which will initialize our interested browser
		
		
		//ChromeBrowser driver=new ChromeBrowser();
		//FirefoxBrowser driver=new FirefoxBrowser();
		//SafariBrowser driver=new SafariBrowser();
		
		//As this hardcoding the objects by commenting and uncommenting the objects to call the specific browser looks ugly and tedious job,so here a very beautiful concept..
		//...comes into picture that is called TOP CASTING,so will create a parent interface reference variable which will point to the specific browser which we want to call..
		//..along with switch case,so in crossbrowser logic in selenium we have a use case with top casting
		WebDriver driver=null;
		String browser="chrome";
		switch(browser.trim())
		{
		case "Chrome":
			driver=new ChromeBrowser();
			break;
		
		case "firefox":
			driver=new FirefoxBrowser();
			break;
		
		case "Safari":
			driver=new SafariBrowser();
			break;
			
		default:
			System.out.println("Please pass the right browser: "+ browser);
			break;
		}	
		
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.sendKeys("'search' field","Shivam Dumka");
		driver.clickElement("search icon");
		driver.closeBrowser();
		
		
		
	}

}
