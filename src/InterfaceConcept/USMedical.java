package InterfaceConcept;

public interface USMedical 
{
	//Interface cannot have any method body just method declaration
	//Only method prototype\
	int min_bill=300;
	
	public void physioServices();
	
	public void oncologyServices();
	
	public void dentalServices();
	
	public void emergency();
	
	
	//Only static method can have method body in interfaces,i.e.static methods of interfaces aren't abstract
	public static void billing()
	{
		System.out.println("US Billing");
	}
}
