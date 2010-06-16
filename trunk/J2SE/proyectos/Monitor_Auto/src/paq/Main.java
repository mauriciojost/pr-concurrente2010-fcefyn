package paq;

public class Main {
	public static void main(String[] args) {
		int i, capacidad=200, nroPasajeros=1000;
		Vehiculo v = new Colectivo_conmonitor_34189197(capacidad/2,capacidad/2);
		
		for(i=0; i<nroPasajeros; i++){
			Persona p = new Persona(i+1);
			p.entrarAlVehiculo(v);
		}
	}
}
