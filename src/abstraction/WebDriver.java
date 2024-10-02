package abstraction;

public interface WebDriver
{
	//When to use abstract class vs interface:
		//Lets understand it with a webdriver interface which is implemented by three browsers lets say-Chrome,firefox and safari driver..
		//Webdriver says following features have be implemented in any browser will will be launched:1.get(String URL) 2.String getTitle()
		//3.click on an element 4.sendkeys-click on an element and write into it  5.close browser
		
		
		//2 main advantages of using webdriver as an interface and not abstract class are: a).100% abstraction 
		//achieved through interface:we dont want webdriver to take any action/decision,it will just define the functionalities..
		//.. to be performed by browsers,browsers will override and will be able to implement the methods defined by the interface because....
		//..features have to be provided by browser not interface b).suppose child class want to inherit from another class/Interface..
		//...would child class be able to inherit from multiple parent class,no,but one child class can inherit from multiple 
		//...parent interfaces

	public void get(String url);
	public String getTitle();
	public void clickElement(String element);
	public void sendKeys(String element,String value);
	public void closeBrowser();
	
}
