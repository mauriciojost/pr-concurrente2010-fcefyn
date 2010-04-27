package paquete;

public class Tigre extends Animal implements Corredor {
	protected Pista pista;
	protected int posicion=0;

	
	
	public Tigre (String tigre){		/*CONSTRUCTOR de tigres*/
		super(tigre);
	}

	@Override
	public void correr() {

		Runnable runab = this; 
		String nombre_hilo = this.getID();
		Thread hilo = (new Thread(runab, nombre_hilo));
		hilo.setPriority(10);
		hilo.start();
	}

	@Override
	public String getID() {	/*mi nombre*/
		return this.getNombre();
	}

	@Override
	public void setPista(Pista pista) {
		this.pista = pista;
		
	}

	@Override
	public void run() {
		try{
			while(true){	/*actualizo posicion en pista*/
				posicion = Integer.parseInt(pista.setPosition(this, Integer.toHexString(posicion+1)),16);
			}
		}catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() +", he llegado a la meta! <<<<<<<<<<<<<<<");
		}
		
	}

}
