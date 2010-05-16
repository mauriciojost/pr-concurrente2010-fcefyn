package paquete;

import java.util.concurrent.Semaphore;

public class ColectivoConSemaphore_32553816_33602761 extends Vehiculo {

	private Semaphore inspA;
	private Semaphore inspB;

	public ColectivoConSemaphore_32553816_33602761(int ingresosPorA, int ingresosPorB) {
		super(ingresosPorA, ingresosPorB);
		inspA = new Semaphore(1);
		inspB = new Semaphore(1);
		
	}

	@Override
	
	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {
		inspA.acquireUninterruptibly();
		if(getIngresosPorPuertaA()<getIngresosPermitidosPorPuertaA()){
			incrementarIngresosPorPuertaA();
		}
		inspA.release();
	}

	
	@Override
public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
		inspB.acquireUninterruptibly();
		if(getIngresosPorPuertaB()< getIngresosPermitidosPorPuertaB()){
			incrementarIngresosPorPuertaB();
		}
		inspB.release();
	}
	
	@Override
	public String getAPELLIDONombreDelAlumno() {		
		return "Furey, Ignacio - Chiappe Bernardo";
	}
}

