package mapTesting;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) 
	{
		
		HashMap<String,Integer> emp=new HashMap<String,Integer>();
		emp.put("Tom", 20);
		emp.put("Shivam", 27);
		emp.put("Dheeraj", 28);
		emp.put("Rohit", 29);
		emp.put("Bhajji", 34);
		
		System.out.println(emp);
		
		
		
		
		
//		HashMap<String,Object> arr1=new HashMap<String,Object>();
//		arr1.put(null, null);
//		System.out.println(arr1.get(null));
//		arr1.put(null, "Shivam");
//		System.out.println(arr1.get(null));
//		arr1.put("Name", "Dumka");
//		arr1.put(null, "Shivam");
//		
//		arr1.put("Age", 27);
//		arr1.put("Designation","SDET1");
//		System.out.println(arr1);
		
		
	}

}
