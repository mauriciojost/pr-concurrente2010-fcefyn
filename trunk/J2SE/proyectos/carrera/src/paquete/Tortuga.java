package paquete;

public class Tortuga extends Animal implements Corredor{
	
	protected Pista pista;
	protected int position=0;

	Tortuga (String nombre){
		super (nombre);
	}
	public void correr() {
		Runnable runab = this; 
		String nombre_hilo = this.getID();
		Thread nuevo_hilo = (new Thread(runab,nombre_hilo)); 
		nuevo_hilo.start();
	
}
	public void run() {
		try{
			while(true){
				position = Integer.parseInt(pista.setPosition(this, Integer.toHexString(position+1)),9);
			}
		}catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() +". He llegado al final!");
		}
	}


	public void setPista(Pista pista) {
		this.pista = pista;
	}



	public String getID() {
		return this.getNombre();
	}
}
