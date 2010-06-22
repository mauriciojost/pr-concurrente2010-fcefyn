package paquete;

import java.util.Random;

public class Persona implements Pasajero {
	
	private int id;
	private Vehiculo v;
	private Random rdm = new Random();
	
	public Persona(int _id){
		this.id = _id;
	}

	@Override
	public void entrarAlVehiculo(Vehiculo _v) {	
		this.v = _v;
		Thread hilo = new Thread(this);
		hilo.start();
	}
	
	public int get_id(){
		return this.id;
	}
	
	@Override
	public void run() {
		boolean puerta = rdm.nextBoolean();
		if(puerta) v.dejarEntrarAPasajeroPorPuertaA(this);
		else v.dejarEntrarAPasajeroPorPuertaB(this);		
	}

}
