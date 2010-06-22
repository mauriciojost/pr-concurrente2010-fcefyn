package paquete;

import main.Generator;
import mauricio.OneFile200404067;
import mauricio.Otra;

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
		int i, capacidad=200, nroPasajeros=1000;
		Vehiculo veh = new ColectivoSinControl(capacidad/2,capacidad/2);
		
		switch(alumno){
		
			/* Ingresar el bloque de código de inicialización para cada alumno. */
		
			case MATRICULA_MAURICIO: 
				
				for(i=0; i<nroPasajeros; i++){
					Persona p = new Persona(i+1);
					Monitor_200404067 mon = Monitor_200404067(veh);
					p.entrarAlVehiculo(mon);
				}

				break;
						
			default:
				System.out.println("Ingrese su nro. de alumno e implemente su sección de código.");
		}

	}
}
