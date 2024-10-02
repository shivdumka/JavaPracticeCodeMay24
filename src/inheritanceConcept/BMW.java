package inheritanceConcept;

public class BMW extends Car 
{
	
	@Override
	public void start()
	{
		System.out.println("BMW Start");
		refuel();
	}
	
	
	public void autoParking()
	{
		System.out.println("BMW autoparking");
		stop();
	}
	
	//Same name,same parametered method among parent and child classes is called Method Hiding
	public static void horn()
	{
		System.out.println("BMW Horn");
	}
}
