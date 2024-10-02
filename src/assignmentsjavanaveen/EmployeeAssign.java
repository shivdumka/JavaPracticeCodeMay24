package assignmentsjavanaveen;

public class EmployeeAssign {

	String name;
	int age;
	double salary;
	public static void main(String[] args)
	{
		//Very important interview question
		//How reassigning of object reference name to another objects work,see below for understnading,its a bit complex and interview qs
		EmployeeAssign e1=new EmployeeAssign();
		e1.name="TOM";
		e1.age=30;
		e1.salary=30;
		
		EmployeeAssign e2=new EmployeeAssign();
		e2.name="SAM";
		e2.age=32;
		e2.salary=40;
		
		EmployeeAssign e3=new EmployeeAssign();
		e3.name="KAT";
		e3.age=30;
		e3.salary=39;
		
		EmployeeAssign e4=new EmployeeAssign();
		e4.name="Nick";
		e4.age=30;
		e4.salary=30;
		
		System.out.println(e1.name+ " "+e1.age+ " "+e1.salary);
		System.out.println(e2.name+ " "+e2.age+ " "+e2.salary);
		System.out.println(e3.name+ " "+e3.age+ " "+e3.salary);
		System.out.println(e4.name+ " "+e4.age+ " "+e4.salary);
		
		System.out.println("---------------------------------------------------");
		
		//important from here,the play is all here,dont just look analyze the output.
		e1=e2;
		e2=e3;
		e3=e4;
		e4=e1;
		
		System.out.println(e1.name+ " "+e1.age+ " "+e1.salary);
		System.out.println(e2.name+ " "+e2.age+ " "+e2.salary);
		System.out.println(e3.name+ " "+e3.age+ " "+e3.salary);
		System.out.println(e4.name+ " "+e4.age+ " "+e4.salary);

	
	}

}
