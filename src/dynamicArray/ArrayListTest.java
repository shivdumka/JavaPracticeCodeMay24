package dynamicArray;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListTest {

	public static void main(String[] args)
	{
		//ArrayList arr=new ArrayList();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(8, 100);
		System.out.println(arr);
//		arr.add(100);
//		arr.add(200);
//		System.out.println(arr.size());
//		arr.add(300);
//		arr.add(400);
//		arr.add(500);
//		arr.add(600);
//		arr.add(700);
//		arr.add(800);
//		try {
//		arr.add(null);
//		}
//		catch(NullPointerException e)
//		{
//			e.printStackTrace();
//		}
	//	Object a=arr.get(0);
	//	System.out.println(a);
//		System.out.println(arr.size());
	//	arr.add("Shivam");
		//	System.out.println(arr.add("Dumka"));  ---why o/p is true
		//arr.remove(10);
		
		System.out.println("Normally traversing through arraylist: "+arr);
//		
//		for(int i=0;i<=arr.size()-1;i++)
//		{
//			System.out.println(arr.get(i));
//		}
//		
//		for(int e:arr)
//		{
//			System.out.println(e);
//		}
		
	}

}
