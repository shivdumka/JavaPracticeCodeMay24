package javasessions;

public class ArrayAsParameters
{
	int arr[]=new int[5];
	public int[] fillArray()
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i+2;
		}
		return arr;
	}	
	public void printArray(int d[])
	{
		for(int f:d)
		{
			System.out.println(f);
		}
	}
//	public void test(int[] array)
//	{
//		for(int e:array)
//		{
//			System.out.println(e);
//		}
//	}
	public static void main(String[] args)
	{
		ArrayAsParameters ar=new ArrayAsParameters();
		int b[]=ar.fillArray();
		ar.printArray(b);
//		System.out.println(b);
		
//		int myArray[]= {1,2,3,4,5};		
//		ArrayAsParameters a=new ArrayAsParameters();
//		a.test(myArray);
	}

}
