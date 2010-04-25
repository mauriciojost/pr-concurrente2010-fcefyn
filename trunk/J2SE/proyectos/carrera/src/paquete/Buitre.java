package paquete;

public class Buitre extends Animal implements Corredor {
	
	protected Pista pista; 
	protected int posicion = 0;
	
	Buitre(String nombre) {
		
		super(nombre);
		
	}

	public void correr() {
		
		Runnable runab = this; 
		String nombre_hilo = this.getID();
		Thread hiloBuitre = (new Thread(runab, nombre_hilo));
		hiloBuitre.setPriority(10);
		hiloBuitre.start();
		
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
			System.out.println("Soy " + this.getID() +". Llegue a la meta!!!");
		}
	}		

}
