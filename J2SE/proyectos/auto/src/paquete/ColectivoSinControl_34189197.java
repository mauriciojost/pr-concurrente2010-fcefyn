package paquete;

public class ColectivoSinControl_34189197 extends Vehiculo {

	public ColectivoSinControl_34189197(int ingresosPorA, int ingresosPorB) {
		super(ingresosPorA, ingresosPorB);
	}

	@Override
	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {
		int a,b;
		a=this.getIngresosPorPuertaA();
		b=this.getIngresosPermitidosPorPuertaA();
		if(a<b){
			this.incrementarIngresosPorPuertaA();
		}
		
	}

	@Override
	public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
		int a,b;
		a=this.getIngresosPorPuertaB();
		b=this.getIngresosPermitidosPorPuertaB();
		if(a<b){
			this.incrementarIngresosPorPuertaB();
		}
	
	}

	@Override
	public String getAPELLIDONombreDelAlumno() {
		String nombre = "Samban_Dario";
		
		return nombre;
	}
	
	

}
