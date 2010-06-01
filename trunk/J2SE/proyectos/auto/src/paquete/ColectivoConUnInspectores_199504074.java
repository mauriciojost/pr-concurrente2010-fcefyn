package paquete;

public class ColectivoConUnInspectores_199504074 extends Vehiculo {
	
	public ColectivoConUnInspectores_199504074(int ingresosPorA, int ingresosPorB) {
		super(ingresosPorA, ingresosPorB);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {
		synchronized(this.getInspectorA()){
		int portA,portB;
		portA=this.getIngresosPermitidosPorPuertaA();
		portB=this.getIngresosPorPuertaA();
		if(portB>portA){
		
		
		this.incrementarIngresosPorPuertaA();
		
		}
		}
	}

	@Override
	public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
		synchronized(this.getInspectorA()){
		int portA,portB;
		portA=this.getIngresosPermitidosPorPuertaB();
		portB=this.getIngresosPorPuertaB();
		if(portB>portA){
		this.incrementarIngresosPorPuertaB();
		}
		}
	}

	@Override
	public String getAPELLIDONombreDelAlumno() {
		String nombre= "Laura Baez";
		return nombre;
	}




}
