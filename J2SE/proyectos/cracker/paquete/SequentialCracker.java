package paquete;

/* Clase que implementa Cracker. */
public class SequentialCracker implements Cracker {
	private int clave = 0; /* Atributo privado que representa a la clave en curso. */
	
	/* Obtención de la clave secuencial. */
	public String getNextKey(boolean ultima_clave_se_paso) {
		//System.out.println("Probando la clave: " + clave + "...");
		String cadena;
		cadena = String.valueOf(clave++);
		return cadena;
	}

	/* Obtención del nombre del alumno. */
	public String getStudentName() { 
		return "APELLIDOS, Nombres";
	}
	
	public int getCurrentKey(){
		return clave;
	}
}
