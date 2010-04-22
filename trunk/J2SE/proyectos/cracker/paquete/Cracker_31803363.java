package paquete;

public class Cracker_31803363 implements Cracker {
static int xr;
static int xi=0 ,xf= 10000;
String llave;
    boolean primeravez = true;
    
	@Override
	public String getNextKey(boolean ultimaClaveSePaso) {

	if(primeravez){
	 	xr=5000;
	 	primeravez = false;
	}
	
	if(primeravez = false){
		
	if(ultimaClaveSePaso = false){
	xr=((xi+xf)/2);	
	xf = xr; 
		}
	} 
	if(ultimaClaveSePaso ){
		xr=((xi+xf)/2);
		xi = xr;
		
	}
	
	llave = String.valueOf(xr);
	return llave;
	
	}

	@Override
	public String getStudentName() {
		 String Name= "Martinet Pablo";
		return Name;
	}

}
