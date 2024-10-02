package javasessions;

public class TypecastingConcept {

	public static void main(String[] args)
	{
		byte b=100;
		short s=b;
		System.out.println(s);   //This shows byte being smaller than short can be fitted into its big brother i.e. short
		
		//But is this possible to convert short to int?Lets try
		short s1=200;
		byte b1=(byte)s1;    //Here we get a compiler error which says cannot convert byte to short
		System.out.println(b1);   //-56 is O/P,why Negative value and value of 200 is out of bound for byte?
								  //-56 is O/P bcoz here as 200 is out of bounds for byte as byte is -128 to 127
								  //but as we have forcefully casted the short to byte therefore there is some loss of data
								  //how we got -56?
								  //total number of elements in byte=-128 to 127=256,200-256=-56
								  //This process of conversion of data types from higher datatype to lower(forcefully).....
								  //.. ....or lower data type to higher is called Type casting. 
								  //Two type of typecasting-Widening and Narrowing
								//remember this sequence from left to right and right to left both:
								//byte--short--char--int--long--float--double
								
		
		//Widening concept(Automatic type conversion)
		byte bw=17;
		int i=bw;
		System.out.println(i);
		
		//narrowing concept
		int j=1000;
		byte bn=(byte)j;
		System.out.println(bn);  //loss of data therefore it will narrow down to the value of byte range,
								 //100-256=744,744-256=488,488-256=232,232-256=-24,-24 is within the range of byte,therefore it is O/P
		
		int ij=100;
		float f=ij;
		System.out.println(f);
		
		float ff=12.33323f;
		int mk=(int)ff;
		System.out.println(mk);   //Use case-In amazon,if we want to remove decimal from pricing details,we can quickly typecast
	
		int d=10000;
		double dd=d;
		System.out.println(dd);
		
		char co='a'; //Ascii-97
		int cv=co;
		System.out.println(cv);
		
		int bv=97;
		char cb=(char)bv;
		System.out.println(cb);
	
		int io=1200;
		char vm=(char)io;
		System.out.println(vm);   //Unicode value gets printed
		
		 
	}
	
	

}
