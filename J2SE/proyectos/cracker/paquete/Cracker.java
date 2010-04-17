package paquete;

/* Interfaz Cracker. */
public interface Cracker {
	/* Obtiene la clave generada por el algoritmo del crack.
	 * 'ultima_clave_se_paso' indica si la clave anterior se excedió en su valor, o estuvo por debajo (estrictamente).  
	 */
	public String getNextKey(boolean ultima_clave_se_paso);
	
	/* Obtención del nombre del estudiante. Formato: 'APELLIDOS, Nombres'. */
	public String getStudentName();
}
