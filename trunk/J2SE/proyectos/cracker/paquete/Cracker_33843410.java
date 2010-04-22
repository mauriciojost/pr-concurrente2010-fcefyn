package paquete;

public class Cracker_33843410 implements Cracker {

	private int clave1 = 0;
	private int sup=9999,inf=0;

	public String getNextKey (boolean ultima_Clave_Se_Paso) {

		if (ultima_Clave_Se_Paso==true)
			sup=clave1;
		else  inf=clave1;

		clave1=((sup+inf)/2);

		String cadena;
		cadena = String.valueOf(clave1);
		return cadena;						    
	}


	public String getStudentName() { 
		return "Soler, Janet";
	}
}


