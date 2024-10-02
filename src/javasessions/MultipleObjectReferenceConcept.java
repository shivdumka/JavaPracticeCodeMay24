 package javasessions;

public class MultipleObjectReferenceConcept 
{
	//CLass Variable
	String name;
	int age;
	String city;
	static int wheel=4;

	public static void main(String[] args) 
	{
		
									
		MultipleObjectReferenceConcept e1=new MultipleObjectReferenceConcept();
		e1.name="Sonam";
		e1.age=32;
		e1.city="Birmingham";
	
		
		MultipleObjectReferenceConcept e2=new MultipleObjectReferenceConcept();
		e2.name="Ridhhi"; 
		e2.age=28;
		e2.city="Brampton";
		
		MultipleObjectReferenceConcept e3=new MultipleObjectReferenceConcept();
		e3.name="Sachal";
		e3.age=45;
		e3.city="Torontto";
		
		MultipleObjectReferenceConcept e4=new MultipleObjectReferenceConcept();
		e4.name="Saanchi";
		e4.age=38;
		e4.city="Hawaii";
		
		System.out.println(e1.name+" "+e1.age+" "+e1.city);  //Sonam
		System.out.println(e2.name+" "+e2.age+" "+e2.city);	 //Ridhhi
		System.out.println(e3.name+" "+e3.age+" "+e3.city);  //Sachal
		System.out.println(e4.name+" "+e4.age+" "+e4.city);	 //Saanchi
		 if(e4.name.trim().equalsIgnoreCase(null))
		
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		
		e1=e2;
		e2=e3;
		e3=e4;
		e4=e1;
		
		System.out.println(e1.name+" "+e1.age+" "+e1.city);  //Ridhhi	  
		System.out.println(e2.name+" "+e2.age+" "+e2.city);	 //Sachal
		System.out.println(e3.name+" "+e3.age+" "+e3.city);	 //Saanchi
		System.out.println(e4.name+" "+e4.age+" "+e4.city);	 //Ridhhi

		
	}

}
