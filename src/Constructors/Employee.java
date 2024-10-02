package Constructors;
public class Employee {
	String name;
	int age;
	char gender;
	double salary;
	boolean isPerm;
	//Constructor looks like a function but is not a function
		//Constructor doesnt returns any value nor void is used
		//Name of the constructor is the same as the class name
		//Constructor is used for initializing the global variables by using this keyword(this.Global Variable=local Variable)
		//Constructor is used to restrict,strictly restrict the creation of unnecessary objects,but default constructor should not 
		//be created otherwise one can create unnecessary objects,if a parameterized constructor is created then object ....
		//...should also be created by passing the one to one parameters otherwise error will be thrown
//	public Employee()
//	{
//		System.out.println("default constructor"); //this default constructor will not help in unnecessary object creation
//	}
	public Employee(String name,int age)
	{
		System.out.println("Name is:"+name+" age:"+age);
		this.name=name;
		this.age=age;
	}
	
	public static void main(String[] args)
	{
		//Employee e1= new Employee();
		//System.out.println(e1.name+" "+e1.age);
	}

}
