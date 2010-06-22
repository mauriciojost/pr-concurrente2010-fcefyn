package mauricio;

import principal.*;

public class Monitor_200404067 extends Vehiculo {
	private Vehiculo monitoreado = null;
	
	public Monitor_200404067(int ingresos_por_a, int ingresos_por_b) {
		super(0, 0); /* Atributos no utilizados (se utilizarán los del vehículo a monitorear). */
	}
	
	public Monitor_200404067(Vehiculo monitoreado){
		super(0,0);
		this.monitoreado = monitoreado;
	}

	@Override
	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {
		synchronized(this){
			int capac = monitoreado.getIngresosPermitidosPorPuertaA();
			int realizados = monitoreado.getIngresosPorPuertaA();
			if (realizados < capac) {
				monitoreado.dejarEntrarAPasajeroPorPuertaA(p);
			}
		}
	}

	@Override
	public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
		synchronized(this){
			int capac = monitoreado.getIngresosPermitidosPorPuertaB();
			int realizados = monitoreado.getIngresosPorPuertaB();
			if (realizados < capac) {
				monitoreado.dejarEntrarAPasajeroPorPuertaB(p);
			}
		}
	}

	@Override
	public String getAPELLIDONombreDelAlumno() {
		return "JOST, Mauricio G.";
	}

}
