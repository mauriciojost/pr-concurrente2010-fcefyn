package paquete;

public class ColectivoConDosInspectores_32578216 extends Vehiculo {
	public ColectivoConDosInspectores_32578216(int ingresosPorA, int ingresosPorB){
		super(ingresosPorA, ingresosPorB);	
	}

	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {
		synchronized(this.getInspectorA()){
			if( this.getIngresosPorPuertaA() < this.getIngresosPermitidosPorPuertaA())
				this.incrementarIngresosPorPuertaA();
		}		
	}

	public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
		synchronized(this.getInspectorB()){
			if( this.getIngresosPorPuertaB() < this.getIngresosPermitidosPorPuertaB())
				this.incrementarIngresosPorPuertaB();
		}
	}

	public String getAPELLIDONombreDelAlumno() {	
		return "Reyes_Ivan";
	}
}
