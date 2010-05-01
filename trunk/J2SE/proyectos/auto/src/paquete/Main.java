package paquete;

public class Main {
	public static void main(String[] args) {
		int i, capacidad=200, nroPasajeros=1000;
		//Vehiculo v = new ColectivoSinControl(capacidad/2,capacidad/2);
		//Vehiculo v = new ColectivoConUnInspector(capacidad/2,capacidad/2);
		//Vehiculo v = new ColectivoConDosInspectores(capacidad/2,capacidad/2);
		Vehiculo v = new ColectivoConDosInspectoresSemaphore(capacidad/2,capacidad/2);
		
		for(i=0; i<nroPasajeros; i++){
			Persona p = new Persona("Persona"+i);
			p.entrarAlVehiculo(v);
		}
	}
}
