package paquete;


/* Clase que implementa Cracker. */
public class Cracker_200204946 implements Cracker {
	private int max=9999; /* Valor maximo del intervalo*/
	private int min=0000; /* Valor minimo del intervalo */
	private int clave =-1; /* Atributo privado que representa a la clave en curso. */
	
	
	/* Obtención de la clave acotando el intervalo. */
	public String getNextKey(boolean ultima_clave_se_paso) {
		String cadena = null; /*Cadena auxiliar*/
		
		/*Primer Clave a testear*/
		if(clave==-1){
			clave=1234;	
		}else{
			
			/*Establece la proxima clave implementando busqueda binaria*/
			if(ultima_clave_se_paso){
				max=clave-1;
				clave=((max+min)/2);
			
			}else{
				min=clave+1;
				clave=((max+min)/2);
			}
		}
		
		/* Clave int>string*/
		cadena = String.valueOf(clave);
		return cadena;
	}


	/* Obtención del nombre del alumno. */
	public String getStudentName() { 
		return "SUREDA, José";
	}
	
	public int getCurrentKey(){
		return clave;
	}
}