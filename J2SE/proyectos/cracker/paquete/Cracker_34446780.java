package paquete;


public class Cracker_34446780 implements Cracker {
	private int inf=0,sup=10000,c=1;
	
	public String getNextKey(boolean ultima_clave_se_paso) {
		String cadena;
		
		if (c==1){
			c=5000;
			cadena = String.valueOf(c);
		}
		else if (ultima_clave_se_paso){
			sup=c;
			c=(sup+inf)/2;
			cadena = String.valueOf(c);
		}
		else {
			inf=c;
			c=(sup+inf)/2;
			cadena = String.valueOf(c);
		}
		
		return cadena;
	}


	public String getStudentName() { 
		return "Diaz Acuña, Jonathan";
	}
	
	public int getCurrentKey(){
		return c;
	}
}
