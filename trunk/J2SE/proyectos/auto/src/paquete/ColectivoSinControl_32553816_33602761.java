package paquete;

public class ColectivoSinControl_32553816_33602761 extends Vehiculo {
	
	public ColectivoSinControl_32553816_33602761(int ingresosPorA, int ingresosPorB) {
		super(ingresosPorA, ingresosPorB);
		
	}

	//@Override
	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {
		if(getIngresosPorPuertaA()<getIngresosPermitidosPorPuertaA()){
			incrementarIngresosPorPuertaA();
		}
	}

	//@Override
	public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
		if(getIngresosPorPuertaB()< getIngresosPermitidosPorPuertaB()){
			incrementarIngresosPorPuertaB();
		}
	}

	//@Override
	public String getAPELLIDONombreDelAlumno() {		
		return "Furey, Ignacio - Chiappe Bernardo";
	}
	
	

	

}
