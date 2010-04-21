package paquete;

public class Cracker_34189197 implements Cracker{
	
	private int clave=-1,max=10000,min=0;

	public String getNextKey(boolean cpaso) {
		String cadena;		
		if (clave==-1){
			clave=5000;
			cadena = String.valueOf(clave);	
		}	
		else if(cpaso){
			max = clave;
			clave = min+(max-min)/2;
			cadena = String.valueOf(clave);
		}
		else {
			min = clave;
			clave = min+(max-min)/2;
			cadena = String.valueOf(clave);
		}
		return cadena;
	}
	public String getStudentName() { 
		return "SAMBAN, Dario";
	}
	
	public int getCurrentKey(){
		return clave;
	}
}
