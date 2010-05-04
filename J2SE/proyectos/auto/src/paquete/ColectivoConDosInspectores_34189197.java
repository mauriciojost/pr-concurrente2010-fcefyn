package paquete;

public class ColectivoConDosInspectores_34189197 extends Vehiculo {

	public ColectivoConDosInspectores_34189197(int ingresosPorA,
			int ingresosPorB) {
		super(ingresosPorA, ingresosPorB);
		
	}

	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {
		synchronized(this.getInspectorA()){
		int a,b;
		a=this.getIngresosPorPuertaA();
		b=this.getIngresosPermitidosPorPuertaA();
		if(a<b){
			this.incrementarIngresosPorPuertaA();
		}
		}
		
	}

	@Override
	public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
		synchronized(this.getInspectorB()){
		int a,b;
		a=this.getIngresosPorPuertaB();
		b=this.getIngresosPermitidosPorPuertaB();
		if(a<b){
			this.incrementarIngresosPorPuertaB();
		}
		}
	
	}

	@Override
	public String getAPELLIDONombreDelAlumno() {
		String nombre = "Samban_Dario";
		
		return nombre;
	}
	

}


