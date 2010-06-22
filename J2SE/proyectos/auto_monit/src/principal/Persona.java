package principal;

import java.util.Random;

public class Persona implements Pasajero {
	
	private int id;
	private Vehiculo v;
	private Random rdm = new Random();
	
	public Persona(int id){
		this.id = id;
	}

	@Override
	public void entrarAlVehiculo(Vehiculo v) {	
		this.v = v;
		Thread hilo = new Thread(this);
		hilo.start();
	}
	
	public int get_id(){
		return this.id;
	}
	
	@Override
	public void run() {
		boolean puerta = rdm.nextBoolean();
		System.out.println("Persona intentando entrar al vehículo por puerta " + (puerta?"A":"B") + ".");
		if(puerta) 
			v.dejarEntrarAPasajeroPorPuertaA(this);
		else 
			v.dejarEntrarAPasajeroPorPuertaB(this);		
	}

}
