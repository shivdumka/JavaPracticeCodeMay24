package abstraction;

public abstract class Page extends Website{
	
	//Abstract class---->we can have both abstract and non abstract method,and even no abstract method also.
	//Through Abstract class---->
		//0% abstraction--->Yes,means no abstract method in abstract class is also allowed,therefore 0% abstraction
		//100% abstraction--->Yes,means only abstract method in abstract class is also allowed,therefore 100% abstraction
		//Partial abstraction--->Yes,means mixture of abstract and non abstract method is also allowed
	//whereas Interfaces are always 100% abstraction,although static methods and default non static methods can have method body after java 8
	
	
	//Object creation of abstract classes is not allowed,Cant instantiate abstract class
	
	//Top casting of Abstract class:Overridden+Inherited method can be accessed by object reference variable 'pg'
	//Individual method of LoginPage cannot be accessed by reference variable
	
	//Can we have the constructor of the abstract class???
	//This is allowed,confused?
	//This constructor will be called immediately when we create the object of child class
	//If there is a constructor in a parent class and another constructor in child class then,when we execute the code in........
	//.......caller class then first it will execute the parent class constructor and then child class constructor,remember it!!!
	//So when main method of caller class is executed then first execution will start from child class constructor,but it will stop ...
	//...at first line of constructor declaration of child class,then it will confirm and go on to parent class for looking if any...
	//...parent class constructor is defined or not,therefore it will first execute the parent class constructor and then child class...
	//...constructor will be executed after it.
	
	
	//If we have a parameterized constructor in parent class and default constructor is missing then the child class will....
	//throw an error to explicitly declare a default constructor in parent class
	//So,remember if we have parameterized constructor in parent class then we needs to compulsorily create a default constructor....
	//....in parent class too.
	//Now if we pass a value as arguments in object of child class and we have a parameterized constructor in child class along with...
	//...a default constructor and parent constructors(default+parameterized) in parent class then what will be the sequence of...
	//...execution
	//(Note-So,parameterized constructor in abstract parent class is useless and meaningless as object cant be created for an abstract ...
	//....class and we can't pass any arguments to the parameters)therefore while executing firstly parent class default constructor...
	//....will be executed and then child class parameterized constructor will be executed
	
	
	//Why Java Interfaces Cannot Have Constructor But Abstract Classes Can Have?
	//An Interface is a complete abstraction of class. All data members present in the interface are by default public, static, and..
	//final. All the static final fields should be assigned values at the time of declaration, otherwise it will throw compilation..
	//..error saying “variable variable_Name not initialized in default constructor”.
	//Abstract Class-->The main purpose of the constructor is to initialize the newly created object. In abstract class,
	// we have an instance variable,abstract methods, and non-abstract methods. We need to initialize the non-abstract methods 
	//and instance variables,therefore abstract classes have a constructor.
	
	public Page()
	{
		System.out.println("Parent Page class default constructor");
	}
	
	public Page(int a)
	{
		System.out.println("Parent Page class parametrized constructor "+a);
	}
	
	
	//abstract method
	//explicitly write abstract keyword
	public abstract void title();
	public abstract void url();
	
	
	
	
	//non-abstract method
	public void loading()
	{
		System.out.println("page loading in 20 seconds");
	}
	
	//Final Non abstract method which cannot be overridden 
	public final void displayLogo()
	{
		System.out.println("logo.png");
	}
	

}
