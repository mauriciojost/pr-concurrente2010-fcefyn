package paquete;

import java.util.Random;
import java.lang.Thread;

public class Persona implements Pasajero {
	Vehiculo vehiculo;
	Random eleccion;

	public Persona() {
		eleccion = new Random();
	}
	public void entrarAlVehiculo(Vehiculo v) {
		this.vehiculo = v;
		Thread t = new Thread(this);
		t.start();
		
	}
	public void run() {
		if(eleccion.nextBoolean())
			vehiculo.dejarEntrarAPasajeroPorPuertaA(this);
		else
			vehiculo.dejarEntrarAPasajeroPorPuertaB(this);
			
		
	}

	

}
