package paquete;

public class ColectivoSinControl_32578216 extends Vehiculo {
	public ColectivoSinControl_32578216(int ingresosPorA, int ingresosPorB) {
		super(ingresosPorA, ingresosPorB);
	}
	
	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {			 
			if( this.getIngresosPorPuertaA() < this.getIngresosPermitidosPorPuertaA())
				this.incrementarIngresosPorPuertaA();
		}

	public  void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
			if( this.getIngresosPorPuertaB() < this.getIngresosPermitidosPorPuertaB())
				this.incrementarIngresosPorPuertaB();
		}
		
	public String getAPELLIDONombreDelAlumno() {
		return "Reyes_Ivan";
	}
}
