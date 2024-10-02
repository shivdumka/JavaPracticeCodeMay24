package inheritanceConcept;

public class TestCar {

	public static void main(String[] args) 
	{
		BMW b=new BMW();
		
		//You can access all parent class properties as they all get inherited
		b.start();		//Overridden method
		b.stop();		//Inherited method
		b.autoParking();	//Individual method
		b.refuel();		//Inherited method
		BMW.horn();
		//reverse is not allowed,you cant use child class method in parent class
		Car c=new Car();
		c.start();
		c.stop();
		Car.horn();
		
		//BMW b1=new Car();
		
		//Child class object can be referred by parent class refernce variable
		//Car cc=new BMW();
		try 
		{
		BMW bh=(BMW)new Car();
		System.out.println(bh);
		}
		catch(ClassCastException ch)
		{
			System.out.println("class cast exception occured"+ch);
			ch.printStackTrace();
		}
		
		String mesg="Welcome admin";
		if(mesg.indexOf("admin")>0)
		{
			System.out.println("admin is present");
		}
	}

}
