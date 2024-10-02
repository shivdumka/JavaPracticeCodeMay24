package encapsulationConcept;

public class TestEmp {

	public static void main(String[] args)
	{
//		Employee e=new Employee();
//		e.setName("Pooja");
//		System.out.println(e.getName());
		
		//POST call in crud terminology
		Employee e1=new Employee("Shivam",27,56,true);
		
		//GET call
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSalary()+" "+e1.isPerm());
		
		//what is the use of setter then if constructor is acting as setter for private data members?
		//Setters are used for updation of values or in crud terminology for PUT call
		
		//PUT call
		e1.setAge(28);
		e1.setSalary(90);
		System.out.println(e1.getName()+" "+e1.getAge()+" "+e1.getSalary()+" "+e1.isPerm());
		
//		LoginPage l1=new LoginPage();  //"Shivam@gmail.com","Shivam@123"
//		l1.setUsername("Shivam@gmail.com");
//		System.out.println(l1.getUsername());
//		
//		l1.setPassword("Shivam@123");
//		System.out.println(l1.getPassword());
		
		LoginPage l1=new LoginPage("Shivam@gmail.com","Shivam@123"); 
		l1.doLogin(l1.getUsername(),l1.getPassword());
		l1.setPassword("Kanika@123");	
		System.out.println(l1.getPassword());
	}

}
