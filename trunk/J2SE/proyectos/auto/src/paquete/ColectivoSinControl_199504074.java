package paquete;

public class ColectivoSinControl_199504074 extends Vehiculo{

	

	public ColectivoSinControl_199504074(int ingresosPorA, int ingresosPorB) {
		super(ingresosPorA, ingresosPorB);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {
		
		
		int portA,portB;
		portA=this.getIngresosPermitidosPorPuertaA();
		portB=this.getIngresosPorPuertaA();
		if(portB>portA){
		
		
		this.incrementarIngresosPorPuertaA();
		
		}
	}

	@Override
	public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
		
		int portA,portB;
		portA=this.getIngresosPermitidosPorPuertaB();
		portB=this.getIngresosPorPuertaB();
		if(portB>portA){
		this.incrementarIngresosPorPuertaB();
		
		}
	}

	@Override
	public String getAPELLIDONombreDelAlumno() {
		String nombre= "Laura Baez";
		return nombre;
	}

}
