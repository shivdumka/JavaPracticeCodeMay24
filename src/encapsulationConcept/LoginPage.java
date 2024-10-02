package encapsulationConcept;

public class LoginPage {
	
	private String username;
	private String password;
	
	public LoginPage(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
	public void doLogin(String un,String pwd)
	{
		System.out.println("get Username"+un);
		System.out.println("get Password"+pwd);
		System.out.println("click on login button");
		System.out.println("Successfully logged in");
	}
	

}
