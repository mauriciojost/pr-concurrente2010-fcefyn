package paq;

import mauricio.Monitor_200404067;

public class Main {
	/* Ingresar las matrículas aquí. */
	public static final int MATRICULA_MAURICIO = 200404067;
	public static final int MATRICULA_ORTIZ = 33320188;
	public static final int MATRICULA_SOLER = 33843410;
	public static final int MATRICULA_LUIS_RODRIGUEZ = 32187957;
	public static final int MATRICULA_SAMBAN = 34189197;
	public static final int MATRICULA_PISETTA = 34441188;
	
	/* Fin de matrículas. */
	
	public static void main(String[] args) {
		int alumno=MATRICULA_MAURICIO;
		int i, capacidad=2, nroPasajeros=4;
		Vehiculo veh = new ColectivoSinControl(capacidad/2,capacidad/2);
		
		switch(alumno){
		
			/* Ingresar el bloque de código de inicialización para cada alumno. */
		
			case MATRICULA_MAURICIO: 
				System.out.println("Hola");
				Monitor_200404067 mon = new Monitor_200404067(veh);
				for(i=0; i<nroPasajeros; i++){
					Persona p = new Persona(i+1);
					p.entrarAlVehiculo(mon);
				}

				break;
						
			default:
				System.out.println("Ingrese su nro. de alumno e implemente su sección de código.");
		}

	}
}
