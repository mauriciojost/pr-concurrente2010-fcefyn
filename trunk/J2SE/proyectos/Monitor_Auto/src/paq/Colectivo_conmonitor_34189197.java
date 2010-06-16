package paq;

import java.util.concurrent.Semaphore;

public class Colectivo_conmonitor_34189197 extends Vehiculo {
	
	private Semaphore mutex,puertaA,puertaB;
	private int colaA;
	private int colaB;
	public Colectivo_conmonitor_34189197(int ingresosPorA, int ingresosPorB) {
		super(ingresosPorA, ingresosPorB);
		mutex = new Semaphore(1);
		puertaA = new Semaphore(0);
		puertaB = new Semaphore(0);
		colaA = 0;
		colaB = 0;
	}

	@Override
	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {
		mutex.acquireUninterruptibly();
		if(colaA<this.getIngresosPermitidosPorPuertaA()){
			this.incrementarIngresosPorPuertaA();
			colaA++;
			mutex.release();
			puertaA.acquireUninterruptibly();
		}
		mutex.release();
	}

	@Override
	public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
		mutex.acquireUninterruptibly();
		if(colaB<this.getIngresosPermitidosPorPuertaB()){
			this.incrementarIngresosPorPuertaB();
			colaB++;
			mutex.release();
			puertaB.acquireUninterruptibly();
		}
		mutex.release();
	}

	@Override
	public String getAPELLIDONombreDelAlumno() {
		return "Samban Dario";
	}


}
