package paquete;

public class ColectivoConUnInspector_32553816_33602761 extends Vehiculo {

	public ColectivoConUnInspector_32553816_33602761(int ingresosPorA, int ingresosPorB) {
			super(ingresosPorA, ingresosPorB);
			
		}

		@Override
		
	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {
			synchronized(this.getInspectorA()){
			if(getIngresosPorPuertaA()<getIngresosPermitidosPorPuertaA()){
				incrementarIngresosPorPuertaA();
			}
		}
	}
		
		@Override
	public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
			synchronized(this.getInspectorA()){
			if(getIngresosPorPuertaB()< getIngresosPermitidosPorPuertaB()){
				incrementarIngresosPorPuertaB();
			}
		}
	}
		
		@Override
		public String getAPELLIDONombreDelAlumno() {		
			return "Furey, Ignacio - Chiappe Bernardo";
		}
	}



