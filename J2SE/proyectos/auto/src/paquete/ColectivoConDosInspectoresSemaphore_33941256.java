package paquete;

import java.util.concurrent.Semaphore;

public class ColectivoConDosInspectoresSemaphore_33941256 extends Vehiculo {
	private Semaphore inspectorA = new Semaphore(this.getIngresosPermitidosPorPuertaA());
	private Semaphore inspectorB = new Semaphore(this.getIngresosPermitidosPorPuertaB());
	
	public ColectivoConDosInspectoresSemaphore_33941256(int maxA, int maxB){
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
		String nombre = "Arlettaz Emiliano";
		return nombre;
	}
}
