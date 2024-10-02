package accMod1;

public class Car {

	String name;
	private String chassis;
	public int model;
	protected String color;
	protected int seat;
	
	private void gas()
	{
		
	}
	private void gas(String petrol)
	{
		
	}
	
	public void drive()
	{
		System.out.println("drive");
	}
	private void accesories()
	{
		System.out.println("Car Accessories");
	}
	protected void autoparking()
	{
		System.out.println("Auto Park");
	}
	void brake()
	{
		System.out.println("Brake");
	}
	
	public static void main(String[] args) {
		
		//Can use all default,public,protected and private methods and variable within the same class
		//Car c=new Car();
		

	}

}
