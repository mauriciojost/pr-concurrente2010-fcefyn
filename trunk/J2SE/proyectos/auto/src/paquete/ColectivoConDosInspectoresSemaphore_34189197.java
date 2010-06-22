package paquete;

import java.util.concurrent.Semaphore;

public class ColectivoConDosInspectoresSemaphore_34189197 extends Vehiculo{
	private Semaphore insA=new Semaphore(this.getIngresosPermitidosPorPuertaB());
	private Semaphore insB=new Semaphore(this.getIngresosPermitidosPorPuertaB());
	
	public ColectivoConDosInspectoresSemaphore_34189197(int ingresosPorA,
			int ingresosPorB) {
		super(ingresosPorA, ingresosPorB);
	}
	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {	
			insA.acquireUninterruptibly();
				incrementarIngresosPorPuertaA();
	}

	public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
			insB.acquireUninterruptibly();
				incrementarIngresosPorPuertaB();					
	}

	public String getAPELLIDONombreDelAlumno() {
		String nombre = "Samban_Dario";
		
		return nombre;
	}

}
