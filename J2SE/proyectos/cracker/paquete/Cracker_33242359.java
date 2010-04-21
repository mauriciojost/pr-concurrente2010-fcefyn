package paquete;

public class Cracker_33242359 implements Cracker {

	static int  key;
	static int li;
	static int ls;
	static int lm;
	static boolean primeravez=true;
	static String keycadena;
	
	
	
	public String getNextKey(boolean ultimaClaveSePaso) {
		//System.out.println(ultimaClaveSePaso);
		if(primeravez){
			
			key=5000;
			li=0;
			ls=10000;
			lm=5000;
			
			
		primeravez=false;	
					}
		else	
					{
		if(ultimaClaveSePaso==true){
			ls=lm;
			key=((ls+li)/2);
			lm=key;
			//System.out.println("Por debajo del numero deseado");
			//System.out.println(key);
		}	
			else
		
		if(ultimaClaveSePaso==false){
			li=lm;
			key=((ls+li)/2);
			lm=key;
			//System.out.println("Por ensima del numero deseado");
		}
		
	}

	
	keycadena = String.valueOf(key);
	return keycadena;
	}

		
	
	@Override
	public String getStudentName() {
		String name = "ANTOÑANA, Rodrigo";
		return name;
	}

}
