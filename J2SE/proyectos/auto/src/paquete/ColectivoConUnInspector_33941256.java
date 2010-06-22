package paquete;

public class ColectivoConUnInspector_33941256 extends Vehiculo {
	
	public ColectivoConUnInspector_33941256(int maxA, int maxB){
		super(maxA, maxB);
	}

	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {
		synchronized(this.getInspectorA()){
		int max = this.getIngresosPermitidosPorPuertaA();
		int num = this.getIngresosPorPuertaA();
		if(num < max){
			this.incrementarIngresosPorPuertaA();
		}
		}

	}

	public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
		synchronized(this.getInspectorA()){
		int max = this.getIngresosPermitidosPorPuertaB();
		int num = this.getIngresosPorPuertaB();
		if(num < max){
			this.incrementarIngresosPorPuertaB();
		}
		}

	}

	public String getAPELLIDONombreDelAlumno() {
		String nombre = "Arlettaz Emiliano";
		return nombre;
	}

}
