package javasessions;

public class CallByValueReference 
{
	int number=10;
	public void mark(int number)
	{
		number=number+1;
		System.out.println(number); 
	}
	public static void shark(CallByValueReference c)
	{
		c.number=c.number+1;
		c.mark(c.number);
		System.out.println(c.number);
	}
	
	public static void main(String[] args) 
	{
		CallByValueReference c=new CallByValueReference();
		System.out.println("Before method call:"+c.number); 
		c.mark(c.number);
		CallByValueReference.shark(c);
		System.out.println("Number after method call:"+c.number);  
	}

}
