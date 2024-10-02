package javasessions;

public class StudentSheet 
{

	//getStudentMarks-function
	//input-name
	//return-marks	
	public int getStudentMarks(String name)
	{
		System.out.println("Student name is:"+name);
		switch(name.toLowerCase().trim())
		{
		case "Naveen":
			return 90;
		case "Shivam":
			return 95;
		case "Kanika":
			return 92;
		default:
			System.out.println("Plz pass the correct student name..."+name);
			return -1;
		}	
	}

	public static void main(String[] args)
	{
		StudentSheet s=new StudentSheet();
		int p=s.getStudentMarks("naveen");
		
		System.out.println("Marks are "+p);
		if(p>0)
		{
			System.out.println("Print the marksheet");
		}
	}

}
