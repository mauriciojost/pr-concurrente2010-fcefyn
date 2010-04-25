package paquete;

public class Gacela extends Animal implements Corredor {

	protected Pista pista; 
	protected int posicion = 0;
	
	Gacela(String nombre) {
		
		super(nombre);
		
	}

	public void correr() {
		
		Runnable runab = this; 
		String nombre_hilo = this.getID();
		Thread hilo = (new Thread(runab, nombre_hilo));
		hilo.setPriority(10);
		hilo.start();
		
	}

	public String getID() {

		return this.getNombre();
	}

	public void setPista(Pista pista) {
		
		this.pista = pista;

	}


	public void run() {

		try{
			while(true){
				posicion = Integer.parseInt( pista.setPosition(this, Integer.toHexString(posicion+1)),10);
			}
		}
		catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() + " Y ahora que?");
		}
	}		

}