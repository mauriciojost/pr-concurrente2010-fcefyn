package paquete;

//  En el caso del colectivo sin control entras mas pasajeros de los permitidos, por el echo de que
// otros hilos ejecutan la comprobacion de si se llego a la maxima cantidad permitida, antes
// de que los anteriors actualizen dicha variable. Esto sucede porque no se implemento
// una sincrinizacion que asegure la exclucion mutua en la region critica del codigo.

//  La implementacion del vehiculo con 2 inspectores cuenta con el doble de recursos para compartir
// que el de un inspector, por lo que las tareas se ejecutan en teoria el doble de rapido.

public class ColectivoSinControl_33941256 extends Vehiculo {
	
	public ColectivoSinControl_33941256(int maxA, int maxB){
		super(maxA, maxB);
	}

	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {
		int max = this.getIngresosPermitidosPorPuertaA();
		int num = this.getIngresosPorPuertaA();
		if(num < max){
			this.incrementarIngresosPorPuertaA();
		}

	}

	public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
		int max = this.getIngresosPermitidosPorPuertaB();
		int num = this.getIngresosPorPuertaB();
		if(num < max){
			this.incrementarIngresosPorPuertaB();
		}

	}

	public String getAPELLIDONombreDelAlumno() {
		String nombre = "Arlettaz Emiliano";
		return nombre;
	}

}
