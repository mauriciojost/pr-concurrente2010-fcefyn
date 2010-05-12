package paquete;

public class Main {
	public static void main(String[] args) {
		int i, capacidad=200, nroPasajeros=1000;
		//Vehiculo v = new ColectivoSinControl_34189197(capacidad/2,capacidad/2);
		//Vehiculo v = new ColectivoConUnInspector_34189197(capacidad/2,capacidad/2);
		//Vehiculo v = new ColectivoConDosInspectores_34189197(capacidad/2,capacidad/2);
		//Vehiculo v = new ColectivoConDosInspectoresSemaphore_34189197(capacidad/2,capacidad/2);
		
		Vehiculo cole = new ColectivoConDosInspectores_33941256(capacidad/2,capacidad/2);
		//Vehiculo cole = new ColectivoConUnInspector_33941256(capacidad/2,capacidad/2);
		//Vehiculo cole = new ColectivoSinControl_33941256(capacidad/2,capacidad/2);
		
		for(i=0; i<nroPasajeros; i++){
			Persona p = new Persona(String.valueOf("Persona"+i));
			p.entrarAlVehiculo(cole);
		}
	}
}
