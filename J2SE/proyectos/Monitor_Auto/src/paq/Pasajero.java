package paq;

/* Interfaz Pasajero.
 */
public interface Pasajero extends Runnable{
	/* Método que pone en marcha un hilo que intenta entrar por puerta A o B (aleatoriamente) al 
	 * vehículo dado como parámetro. 
	 * 
	 */
	public void entrarAlVehiculo(Vehiculo v);
}

