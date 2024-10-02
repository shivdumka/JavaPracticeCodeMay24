package javasessions;

public class MainMethodOverloading {

	public static void main()
	{
		System.out.println("Hello");
	}
	
	public static void main(String a)
	{
		
	}
	
	//Main method where program execution starts:
	public static void main(String[] shivam)
	{
			System.out.println(shivam.length);
			String arr[]= {"Naveen","Shivam","Kanika"};
			for(String e:arr)
			{
				System.out.println(e);
			}
	}

}
