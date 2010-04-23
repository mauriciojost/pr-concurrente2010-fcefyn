package paquete;

import java.util.Random;

/* Clase Perro. <Es> Animal y <puede> Correr. */
public class Gato extends Animal implements Corredor{
	private Pista pista; /* Como Corredor necesita conocer la Pista para actualizar su posición al correr. */
	private int position=0; /* Posición actual del Gato. */
	
	Gato(String nombre) {
		super(nombre); /* Constructor de la super-clase (Animal). */
	}

	@Override
	public void correr() {
		/* A los fines didácticos se desglosa esta parte. */
		Runnable runab = this; 
		String nombre_hilo = this.getID();
		Thread nuevo_hilo = (new Thread(runab,nombre_hilo)); /* Creación de un nuevo hilo. */
		nuevo_hilo.start();
	}
	
	
	/* Método que será ejecutado desde un hilo independiente al hacer 'hilo.start()'. */
	/* Este gato traicionero quiere avanzar de a 2 algunas veces. */
	@Override
	public void run() {
		Random rnd = new Random();
		int step;
		try{
			while(true){
				step = ((rnd.nextFloat()>0.999999)?2:1);
				position = Integer.parseInt(pista.setPosition(this, Integer.toHexString(position+step)),16);
			}
		}catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() +". He llegado al final! <<<<<<<<<<<<<<<");
		}
	}

	/* Establece la pista sobre la cual este corredor realizará actualizaciones al correr. */
	@Override
	public void setPista(Pista pista) {
		this.pista = pista;
	}

	/* Retornar el nombre del Alumno! */
	@Override
	public String getID() {
		return this.getNombre();
	}

}
