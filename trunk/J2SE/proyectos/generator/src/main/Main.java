package main;
import mauricio.OneFile200404067;


public class Main {
	public static final int N_CHANNELS = 2;
	
	/* Ingresar las matrículas aquí. */
	public static final int MATRICULA_MAURICIO = 200404067;
	
	/* Fin de matrículas. */
	
	public static void main(String[] args) {
		
		int alumno=MATRICULA_MAURICIO;
		
		switch(alumno){
			/* Ingresar el bloque de código de inicialización para cada alumno. */
			case MATRICULA_MAURICIO: 
				Generator generator = new Generator(N_CHANNELS);
				new OneFile200404067(generator);
				break;
				
			default:
				System.out.println("Ingrese su nro. de alumno e implemente su sección de código.");
		}
		
	}

}
