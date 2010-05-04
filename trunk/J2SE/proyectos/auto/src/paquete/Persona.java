package paquete;

import java.util.Random;

public class Persona implements Pasajero {
	Vehiculo aux;
	Random Rdm = new Random();
	String nombre;
	public Persona(String nom) {
		nombre=nom;
	}
	public void entrarAlVehiculo(Vehiculo v) {

		this.aux=v;
		Thread nombre = new Thread(this);
		nombre.start();
		
	}
	public void run() {
		if(Rdm.nextBoolean())
		this.aux.dejarEntrarAPasajeroPorPuertaA(this);
		else
		this.aux.dejarEntrarAPasajeroPorPuertaB(this);
			
		
	}

	

}
