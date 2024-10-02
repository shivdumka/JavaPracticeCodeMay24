package builderPattern;

public class BuilderPattern 
{
	public BuilderPattern login()
	{
		System.out.println("Logged in");
		return this;
	}
	public BuilderPattern login(String username,String password)
	{
		System.out.println("username "+username+" "+"password "+password);
		return this;
	}
	public BuilderPattern search(String productName)
	{
		System.out.println("Productname:"+productName);
		return this;
	}
	public BuilderPattern search(String productName,double price)
	{
		System.out.println("Productname:"+productName+ " Product price is:"+price );
		return this;
	}
	public BuilderPattern addToCart(String productName)
	{
		System.out.println("Productname:"+productName);
		return this;
	}
	public BuilderPattern doPayment(String upi)
	{
		System.out.println("UPI is:"+upi);
		return this;
	}
	
	public BuilderPattern doPayment(String cc,String cvv)
	{
		System.out.println("Credit Card no. is :"+cc+" CVV is:"+cvv);
		return this;
	}
	public BuilderPattern generateOrder(String orderno)
	{
		System.out.println("Order id is "+orderno);
		return this;
	}
	
	public BuilderPattern logout()
	{
		System.out.println("Logged out");
		return this;
	}
}

