package paquete;

import java.util.concurrent.Semaphore;

public class ColectivoConDosInspectoresSemaphore_34189197 extends Vehiculo{
	private Semaphore insA = new Semaphore(this.getIngresosPermitidosPorPuertaA());
	private Semaphore insB = new Semaphore(this.getIngresosPermitidosPorPuertaB());
	
	public ColectivoConDosInspectoresSemaphore_34189197(int ingresosPorA,
			int ingresosPorB) {
		super(ingresosPorA, ingresosPorB);
	}
	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {
			insA.acquireUninterruptibly();
			int a,b;
			a=this.getIngresosPorPuertaA();
			b=this.getIngresosPermitidosPorPuertaA();
			if(a<b){
				this.incrementarIngresosPorPuertaA();
					}
			insA.release();

	}

	@Override
	public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
			insB.acquireUninterruptibly();
			int a,b;
			a=this.getIngresosPorPuertaB();
			b=this.getIngresosPermitidosPorPuertaB();
			if(a<b){
				this.incrementarIngresosPorPuertaB();
					} 
			insB.release();
	}

	@Override
	public String getAPELLIDONombreDelAlumno() {
		String nombre = "Samban_Dario";
		
		return nombre;
	}

}
