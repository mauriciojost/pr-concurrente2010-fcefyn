package paquete;
public class Cracker_32499066 implements Cracker {

	static int xf=0 ,xn= 10000;
	static int xl;
   
	
	String combinacion;
    boolean primera = true;
    
	
	public String getNextKey(boolean ultima_clave_se_paso) {
		
	if(primera == true){
	 	xl=5000;
		primera = false;
	 	
	   }
         if(primera == false){
		
	       if(ultima_clave_se_paso == false){
	         xl=((xf+xn)/2);	
	         xn = xl; 
		   }
	} 
	if(ultima_clave_se_paso ){
		xl=((xf+xn)/2);
		xf = xl;
		
	}
	
	combinacion = String.valueOf(xl);
	return combinacion;
	
	}

	
	
	
	public String getStudentName() {
		 String Name = "Sosa Fabricio";
		  return Name;
	}}