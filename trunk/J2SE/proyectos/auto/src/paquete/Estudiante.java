package paquete;

//Arlettaz Emiliano DNI: 3394156

public class Estudiante implements Pasajero {
	Vehiculo vehiculo;
	int opcion;
	
	public Estudiante(){
		this.opcion = (int) (Math.random()*2);
		
	}

	public void entrarAlVehiculo(Vehiculo v) {
		this.vehiculo = v;
		Thread t = new Thread(this);
		t.start();
		
	}

	public void run() {
		if(opcion == 0){
			this.vehiculo.dejarEntrarAPasajeroPorPuertaA(this);
		}
		else{
			this.vehiculo.dejarEntrarAPasajeroPorPuertaB(this);
		}

	}

}
