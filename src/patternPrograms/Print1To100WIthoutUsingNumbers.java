package patternPrograms;

public class Print1To100WIthoutUsingNumbers {

	public static void print1to100UsingChar()
	{
		int one='a'/'a';
		char[] ch={'a','b','c','d','e','f','g','h','i','j'};
		int hundred=ch.length*ch.length;
		for(int i=one;i<=hundred;i++)
		{
			System.out.println(i);
		}
	}
	
	public static void print1To100UsingString()
	{
		int one='a'/'a';
		String str="abcdefghij";
		int hundred=str.length()*str.length();
		for(int i=one;i<=hundred;i++)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) 
	{
		print1to100UsingChar();
		print1To100UsingString();
	}

}
