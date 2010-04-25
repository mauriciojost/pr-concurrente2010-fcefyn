package paquete;

public class Chita extends Animal implements Corredor {

	protected Pista pista; 
	protected int posicion=0;
	
	Chita(String nombre) {
		super(nombre);
		
	}

	public void correr() {
		
		
		Runnable runab = this; 
		String nombre_hilo = this.getID();
		Thread chita_hilo = (new Thread(runab,nombre_hilo));
		chita_hilo.setPriority(10);
		chita_hilo.start();
		
	}

	public String getID() {
		
		return this.getNombre();
	}

	public void setPista(Pista pista) {
		
		this.pista=pista;
	}

	public void run() {
		
		try{
			while(true){
				
				posicion = Integer.parseInt(pista.setPosition(this, Integer.toHexString(posicion+1)),10);
			}
		}catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() +". Llegué!!!!wiiiiii!!!!!!XD <<<<<<<<<<<<<<<");
		}
	}
		
		
}


