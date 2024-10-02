package InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) 
	{
		FortisHospital fh=new FortisHospital();
		fh.physioServices();
		fh.cardioServices();
		fh.dentalServices();
		fh.entServices();
		fh.neuroServices();
		fh.oncologyServices();
		fh.orthoServices();
		fh.pathologyServices();
		fh.pediaServices();
		fh.medicalTraining();
		fh.dermaServices();
		fh.emergency();
		
		
		
		//FortisHospital f=new UKMedical();
		
		//No object can be created for interfaces
		//USMedical usm=new USMedical();
		
		USMedical.billing();
		FortisHospital.billing();
	}

}
