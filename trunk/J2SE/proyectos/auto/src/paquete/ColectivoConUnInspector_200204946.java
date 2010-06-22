package paquete;

public class ColectivoConUnInspector_200204946 extends Vehiculo {
	
	//Constructor
	public ColectivoConUnInspector_200204946(int IngMaxA, int IngmaxB){
		super(IngMaxA, IngMaxA);
	}
	
	//Metodo para permitir ingreso por puerta A
	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {
		synchronized(this.getInspectorA()){	
			if(this.getIngresosPorPuertaA() < this.getIngresosPermitidosPorPuertaA()){
				this.incrementarIngresosPorPuertaA();
			}
		}
	}
	
	//Metodo para permitir ingreso por puerta B
	public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
		synchronized(this.getInspectorA()){
			if(this.getIngresosPorPuertaB() < this.getIngresosPermitidosPorPuertaB()){
				this.incrementarIngresosPorPuertaB();
			}
		}
	}
	
	//Devolver APELLIDO y Nombre
	public String getAPELLIDONombreDelAlumno() {
		String nombre = "SUREDA José";
		return nombre;
	}
}