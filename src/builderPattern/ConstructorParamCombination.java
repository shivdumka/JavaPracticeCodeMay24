package builderPattern;

public class ConstructorParamCombination
{
	String Username;
	String password;
	String productName;
	double price;
	String upi;
	String cc;
	String cvv;
	String orderno;
	
	public ConstructorParamCombination(String username, String password) {
		Username = username;
		this.password = password;
	}
public ConstructorParamCombination(String username, String password, String productName) {
	Username = username;
	this.password = password;
	this.productName = productName;
}
public ConstructorParamCombination(String username, String password, String productName, double price, String upi,String orderno) {
	Username = username;
	this.password = password;
	this.productName = productName;
	this.price = price;
	this.upi = upi;
}
public ConstructorParamCombination(String username, String password, String productName, double price, String cc,
		String cvv,String orderno) {
	Username = username;
	this.password = password;
	this.productName = productName;
	this.price = price;
	this.cc = cc;
	this.cvv = cvv;
}


	public void login()
	{
		System.out.println("Logged in");
	}
	public void login(String username,String password)
	{
		System.out.println("username "+this.Username+"password "+this.password);
	}
	public void search(String productName)
	{
		System.out.println("Productname:"+productName);
	}
	public void search(String productName,double price)
	{
		System.out.println("Productname:"+productName+ " Product price is:"+price );	
	}
	public void addToCart(String productName)
	{
		System.out.println("Productname:"+productName);
	}
	public void doPayment(String upi)
	{
		System.out.println("UPI is:"+upi);
	}
	
	public void doPayment(String cc,String cvv)
	{
		System.out.println("Credit Card no. is :"+cc+" CVV is:"+cvv);
	}
	public void generateOrder(String orderno)
	{
		System.out.println("Order id is "+orderno);
	}
	
	public void logout()
	{
		System.out.println("Logged out");
	}
}
	