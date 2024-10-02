package abstraction;

public class TestPage {

	public static void main(String[] args) 
	{
		LoginPage l=new LoginPage(20);
		l.title();
		l.url();
		l.loading();
		l.doLogin();
		l.displayLogo();
		
		
		System.out.println("---------------Top Casting------------------");
		
		//Top Casting:
		Page pg=new LoginPage(20);
		pg.displayLogo();
		pg.loading();
		pg.title();
		pg.url();
		
		
		
		

	}

}
