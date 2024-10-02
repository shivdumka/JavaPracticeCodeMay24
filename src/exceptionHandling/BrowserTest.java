package exceptionHandling;

public class BrowserTest {

	public static void main(String[] args) 
	{
		String browser="shivam";
		switch(browser)
		{
		case "chrome":
			System.out.println("launch Chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		default:
		System.out.println("pls pass correct browser"+browser);
			throw new MyException("===Wrong Browser===");
		}

	}

}
