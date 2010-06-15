package main;

/* Agregue su paquete aqui. */
import mauricio.*;
import ortizsoler.*;
import LuisRodriguez.*;



public class Main {
	public static final int N_CHANNELS = 2;

	
	/* Ingresar las matrículas aquí. */
	public static final int MATRICULA_MAURICIO = 200404067;
	public static final int MATRICULA_ORTIZ = 33320188;
	public static final int MATRICULA_SOLER = 33843410;
	public static final int MATRICULA_LUIS_RODRIGUEZ = 32187957;
	public static final int MATRICULA_SAMBAN = 34189197;
	public static final int MATRICULA_Pisetta = 34441188;
	
	/* Fin de matrículas. */
	
	public static void main(String[] args) {
		
		int alumno=MATRICULA_LUIS_RODRIGUEZ;
		
		switch(alumno){
		
			/* Ingresar el bloque de código de inicialización para cada alumno. */
		
			case MATRICULA_MAURICIO: 

				//Generator generator = new Generator(N_CHANNELS,1);
				//generator.run();

				Generator generator = new Generator(N_CHANNELS, 1);
				new OneFile200404067(generator);

				new Otra(generator);
				break;
			case MATRICULA_ORTIZ:
				/*
				new Pantalla();
				break;
				*/
			case MATRICULA_SOLER:
				/*
				new Pantalla();
				break;
				*/
			case MATRICULA_LUIS_RODRIGUEZ:
				/*
				MiMain mm=new MiMain(); //inicializacion de la pantalla y otros objetos
				break;	
				*/
			case MATRICULA_SAMBAN:
				/*
				 new Creador();
				 break;
				 */
			case MATRICULA_Pisetta:
				/*
				 new Work(generator,N_CHANNELS);
				 break;
				 */
				
			default:
				System.out.println("Ingrese su nro. de alumno e implemente su sección de código.");
		}
		
	}
	

}
