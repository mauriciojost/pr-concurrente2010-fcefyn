/*En el caso del colectivo sin control entran más personas de las permitidas,
 * debido a que mientras la variable compartida es leida, hay personas que 
 * siguen entrando entre la lectura y la comparación. El problema se debe
 * a que la variable no es accedida en exclusión mutua.
 * 
 * La ventaja de la implementación del Vehículo con 2 inspectores respecto 
 * del que tiene 1 sólo, es que se está utilizando el máximo nivel de concurrencia 
 * que permite el problema. Los recursos vienen representados por los dos accesos al
 * colectivo, al tener un solo inspector se puede utilizar una sola puerta por vez,
 * por lo que se obtiene un rendimiento mucho inferior al optimo (dos inspectores)
 */
	

package paquete;
import java.util.concurrent.Semaphore;

public class ColectivoConDosInspectoresSemaphore_32578216 extends Vehiculo {
	private Semaphore inspectorA = new Semaphore(this.getIngresosPermitidosPorPuertaA());
	private Semaphore inspectorB = new Semaphore(this.getIngresosPermitidosPorPuertaB());
	
	public ColectivoConDosInspectoresSemaphore_32578216(int maxA, int maxB){
		super(maxA, maxB);
	}

	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {
		inspectorA.acquireUninterruptibly();
		this.incrementarIngresosPorPuertaA();
	}

	public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
		inspectorB.acquireUninterruptibly();
		this.incrementarIngresosPorPuertaB();
	}

	public String getAPELLIDONombreDelAlumno() {
		return "Reyes Iván";
	}
}

