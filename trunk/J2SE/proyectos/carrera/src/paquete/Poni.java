package paquete;

import java.util.Random;

public class Poni extends Animal implements Corredor {
	protected Pista pista;
	protected int position;

	Poni(String nombre) {
		super(nombre);
	}

	public void correr() {

		final Runnable runab = this;
		final String nombre_hilo = this.getID();
		final Thread nuevo_hilo = (new Thread(runab, nombre_hilo));
		nuevo_hilo.setPriority(10);
		nuevo_hilo.start();
	}

	public String getID() {
		return this.getNombre();
	}

	public void setPista(final Pista pista) {
		this.pista = pista;
	}

	public void run() {
		final Random rnd = new Random();
		int step;
		try {
			while (true) {
				step = ((rnd.nextFloat() > 0.999999) ? 2 : 1);
				position = Integer.parseInt(pista.setPosition(this, Integer
						.toHexString(position + step)), 16);
			}
		} catch (final NumberFormatException e) {
			System.out.println("Soy " + this.getID()
					+ ". LLEGUEEEEEEE! <<<<<<<<<<<<<<<");
		}
	}
}
	
