package paquete;

public class Elefante extends Animal implements Corredor {
	protected Pista pista;
	protected int posicion=0;

	
	
	public Elefante (String Elefante){		/*CONSTRUCTOR*/
		super(Elefante);
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
	public String getID() {
		return this.getNombre();
	}

	@Override
	public void setPista(Pista pista) {
		this.pista = pista;
		
	}

	@Override
	public void run() {
		try{
			while(true){
				posicion = Integer.parseInt(pista.setPosition(this, Integer.toHexString(posicion+1)),9);
			}
		}catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() +". I am the champion***");
		}
		
	}

}
