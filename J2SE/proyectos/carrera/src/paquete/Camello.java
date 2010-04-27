package paquete;

public class Camello extends Animal implements Corredor{

	
	protected Pista pista; 
	protected int posicion=0;
		
	Camello(String nombre) {		
		super(nombre);					
	}


	public void correr() {				
		Runnable runab = this; 			
		String nombre_hilo = this.getID();
		Thread puercoEspin = (new Thread(runab,nombre_hilo));
		puercoEspin.setPriority(10);
		puercoEspin.start();
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
						posicion = Integer.parseInt(pista.setPosition(this, Integer.toHexString(posicion+1)),16);
			}
		
		}catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() +" y ya llegue al final.!!<<<<<<<<<<<<<<<");
		}	
	}

}
