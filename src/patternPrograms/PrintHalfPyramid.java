package patternPrograms;

public class PrintHalfPyramid {

	public static void main(String[] args) 
	{
		int n=4;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
