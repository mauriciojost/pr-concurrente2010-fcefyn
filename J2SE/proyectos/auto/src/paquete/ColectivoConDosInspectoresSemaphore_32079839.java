package paquete;

import java.util.concurrent.Semaphore;

public class ColectivoConDosInspectoresSemaphore_32079839 extends Vehiculo{
    
	Semaphore A = new Semaphore(this.getIngresosPermitidosPorPuertaA(), true);
	Semaphore B = new Semaphore(this.getIngresosPermitidosPorPuertaB(), true);
	
	public ColectivoConDosInspectoresSemaphore_32079839(int ingresosPorA,int ingresosPorB) {
		super(ingresosPorA, ingresosPorB);						
	}
		
			@Override
			public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {								
				if(A.tryAcquire()==true){
					this.incrementarIngresosPorPuertaA();
				}	
			}

			@Override
			public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
				if(B.tryAcquire()==true){
					this.incrementarIngresosPorPuertaB();
				}	
			}

			@Override
			public String getAPELLIDONombreDelAlumno() {
				String nombre = "RIBODINO, José";
				return nombre;
			}
		}
