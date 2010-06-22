
//Reyes Iván
package paquete;

public class Ingeniero implements Pasajero {
	Vehiculo vehiculo;
	int opcion;
	
	public Ingeniero(){
		this.opcion = (int) (Math.random()*2);
	}

	public void entrarAlVehiculo(Vehiculo v) {
		this.vehiculo = v;
		Thread t = new Thread(this);
		t.start();	
	}

	public void run() {
		if(opcion == 0)
			this.vehiculo.dejarEntrarAPasajeroPorPuertaA(this);
		else
			this.vehiculo.dejarEntrarAPasajeroPorPuertaB(this);
	}
}
