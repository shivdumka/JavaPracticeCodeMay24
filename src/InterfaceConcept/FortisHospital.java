package InterfaceConcept;

public class FortisHospital implements USMedical,UKMedical,IndiaMedical 
{
	
	//US
	@Override
	public void physioServices() 
	{
		System.out.println("US Physioservices");
	}
	@Override
	public void oncologyServices()
	{
		System.out.println("oncologyServices");
	}
	@Override
	public void dentalServices()
	{
		System.out.println("dentalServices");
	}
	
	//UK
	@Override
	public void entServices()
	{
		System.out.println("entServices");
	}
	@Override
	public void pediaServices()
	{
		System.out.println("pediaServices");
	}
	@Override
	public void dermaServices()
	{
		System.out.println("dermaServices");
	}
	
	//India
	@Override
	public void cardioServices()
	{
		System.out.println("cardioServices");
	}
	
	@Override
	public void orthoServices()
	{
		System.out.println("orthoServices");
	}
	@Override
	public void neuroServices()
	{
		System.out.println("neuroServices");
	}
	
	//Individual
	public void medicalTraining()
	{
		System.out.println("medicalTraining");
	}
	
	public void pathologyServices()
	{
		System.out.println("pathologyServices");
	}
	
	
	//Common Method for all 3 interfaces
	@Override
	public void emergency() 
	{
	     System.out.println("emergency");	
	}
	
	//static method with the same method name as in interface,but both are individual method in themselves
	public static void billing()
	{
		System.out.println("FH Billing");
	}
}

