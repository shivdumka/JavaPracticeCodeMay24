package encapsulationConcept;

public class Employee 
{
	
	//Encapsulation-data hiding where private data members are accessed via public methods getter and setter
	private String name;
	private int age;
	private double salary;
	private boolean isPerm;
	
	//we can access above private data members via getter and setter functions
	//But suppose if we have 50 private members,dont you think it will be a tedious task to create getters and setters and call....
	//..every public getter and setter in testEmp class?So,our work can be simplified by using constructors which will reduce hard work
	//Constructor will act as setter for me and will also restrict unnecessary object creation
	public Employee(String name, int age, double salary, boolean isPerm) 
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isPerm = isPerm;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	
	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}
	public boolean isPerm() {
		return isPerm;
	}
	
	
}
