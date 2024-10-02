package builderPattern;

public class TestBuilderPattern {

	public static void main(String[] args) 
	{
		BuilderPattern b=new BuilderPattern();
		b.login()
		.search("Nike Shoes")
		.addToCart("Nike Shoes")
		.doPayment("shivam@okhdfc")
		.generateOrder("Order no.202")
		.logout();
		
		System.out.println("----------------------------------------------------------------------");
		
		b.login("shivam@gmail.com ","shivam@123")
		.search("Macbook pro",3200.45)
		.addToCart("Nike Shoes")
		.doPayment("6677 7686 4547 1234","111")
		.generateOrder("Order no.504")
		.logout();

		System.out.println("----------------------------------------------------------------------");
		
		b.login("shivam@gmail.com ","shivam@123")
		.search("Macbook pro",3200.45)
		.logout();
		

		System.out.println("----------------------------------------------------------------------");
		
		b.login("KanikaPandey@orkut.com","kanika@123")
		.logout();
	}

}
