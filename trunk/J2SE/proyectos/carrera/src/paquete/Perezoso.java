package paquete;

public class Perezoso extends Animal implements Corredor{
	protected Pista pista; 
	protected int position=0;
	Perezoso(String nombre) {
		super(nombre);
		
	}

	
	public void correr() {
		
		Runnable runab = this; 
		String nombre_hilo = this.getID();
		Thread nuevo_hilo = (new Thread(runab,nombre_hilo));
		nuevo_hilo.setPriority(10);//Prioridad maxima al Perezoso
		nuevo_hilo.start();
		
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
				
				position = Integer.parseInt(pista.setPosition(this, Integer.toHexString(position+1)),16);
			}
		}catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() +". He llegado al final!...duermo hasta que llegue el resto");
		}
		
	}

}
